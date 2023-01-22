package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

import javax.lang.model.element.Element;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.xml.soap.SOAPElement;

import services.CommandeWS;
import services.CommandeWSService;
import entites.Commande;
import entites.Repas;

@WebServlet(urlPatterns = { "/rechercher", "/PasserCommandeServlet", "/ConfirmationCommande" })
public class GestCommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<services.Repas> repass;
	CommandeWS ws = new CommandeWSService().getCommandeWSPort();

	public GestCommandeServlet() {
		super();
	}


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		
		String servletPath = request.getServletPath();
		// log the servlet path being used
		System.out.println("Servlet path: " + servletPath);
		if (servletPath.equals("/rechercher")) {
		    // get current date
		    Date today = new Date();
		    // set date as attribute of request object
		    request.setAttribute("today", today);

		    String des = "";
		    // log 
		    System.out.println("Searching for meals with description");
		    if (request.getParameter("description") != null) {
		        des = request.getParameter("description").toString();
		        // set description as attribute of request object
		        request.setAttribute("description", des);
		    }
		    // call web service method and get list of meals
		    List<services.Repas> repass = ws.consulterRepas(des);
		    this.repass = repass;
		    // set list of meals as attribute of session object
		    HttpSession session = request.getSession();
		    session.setAttribute("repass", repass);
		    // forward request to jsp page for rendering
		    request.getRequestDispatcher("repasList.jsp").forward(request, response);
		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String servletPath = request.getServletPath();
		HttpSession session = request.getSession();
		if (servletPath.equals("/PasserCommandeServlet") && (request != null)) {
		    // get all parameter names from request
		    Enumeration<String> parameterNames = request.getParameterNames();
		    // loop through all parameter names
		    while (parameterNames.hasMoreElements()) {
		        String paramName = parameterNames.nextElement();
		        // check if parameter name starts with "submit_"
		        if (paramName.startsWith("submit_")) {
		            String refRepas = request.getParameter(paramName);
		            // set selected meal reference as attribute of request
		            request.setAttribute("selectedRefRepas", refRepas);
		            // forward request to addCommande.jsp page
		            request.getRequestDispatcher("addCommande.jsp").forward(request, response);
		        }
		    }
		}
		if ((servletPath.equals("/ConfirmationCommande") && (request != null))) {
		    String nom = request.getParameter("nom").toString();
		    String contact = request.getParameter("contact").toString();
		    // get selected meal reference from request attribute
		    String refRepas =(String) request.getAttribute("selectedRefRepas");
		    // call web service method to place order
		    ws.passerCommande(contact, nom, refRepas);
		    // write message to response
		    response.getWriter().write("Merci Monsieur "+" "+nom+" "+"votre commande à éte passer avec succées  ");
		} 

}}
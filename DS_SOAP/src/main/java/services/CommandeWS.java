package services;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entites.Commande;
import entites.Repas;
import metiers.ICommandeMetierImpl;

@WebService

public class CommandeWS {

	private ICommandeMetierImpl metier = new ICommandeMetierImpl() ; 

	@WebMethod
	public List<Repas> consulterRepas(@WebParam() String des) {
		return metier.consulterRepas( des);
	}

	@WebMethod()
	public void passerCommande(@WebParam String nom, @WebParam String contact,@WebParam Repas repas) {
		metier.passerCommande( nom, contact,repas);
	}


}

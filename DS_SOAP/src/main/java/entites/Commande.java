package entites;

public class Commande {
	  static int refCommande=0;
	    private String nomClient;
	    private String contactClient;
	    private Repas R;

	    public Commande( String nomClient, String contactClient ,Repas R) {

	    	this.refCommande++;
	        this.nomClient = nomClient;
	        this.contactClient = contactClient;
	        this.R=R;
	    }

		/**
		 * 
		 */
		public Commande() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getRefCommande() {
			return refCommande;
		}

		public void setRefCommande(int refCommande) {
			this.refCommande = refCommande;
		}

		public String getNomClient() {
			return nomClient;
		}

		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}

		public String getContactClient() {
			return contactClient;
		}

		public void setContactClient(String contactClient) {
			this.contactClient = contactClient;
		}

		public Repas getR() {
			return R;
		}

		public void setR(Repas r) {
			R = r;
		}

	    // Getters and setters for refCommande, nomClient, and contactClient
		
		
	    
}

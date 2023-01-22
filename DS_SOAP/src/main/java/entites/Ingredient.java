package entites;

public class Ingredient {
	private String codeIngredient;
    private String nomIngredient;
    private double quantite;
    private String uniteMesure;

    public Ingredient(String codeIngredient, String nomIngredient, double quantite, String uniteMesure) {
        this.codeIngredient = codeIngredient;
        this.nomIngredient = nomIngredient;
        this.quantite = quantite;
        this.uniteMesure = uniteMesure;
    }
    
    

	/**
	 * 
	 */
	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getCodeIngredient() {
		return codeIngredient;
	}

	public void setCodeIngredient(String codeIngredient) {
		this.codeIngredient = codeIngredient;
	}

	public String getNomIngredient() {
		return nomIngredient;
	}

	public void setNomIngredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public String getUniteMesure() {
		return uniteMesure;
	}

	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

    // Getters and setters for codeIngredient, nomIngredient, quantite, and uniteMesure
    
}

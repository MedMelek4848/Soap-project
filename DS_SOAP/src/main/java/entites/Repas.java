package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Repas {
	  private String ref_repas;
	    private Date date;
	    private String description;
	    private List<Ingredient> ingredients;

	    public Repas(String ref_repas, String description) {
	        this.ref_repas = ref_repas;
	        date = new Date();
	        this.description = description;
	        this.ingredients=new ArrayList<Ingredient>();
	       	    }

	    /**
		 * 
		 */
		public Repas() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void addIngredient(Ingredient ingredient) {
	        this.ingredients.add(ingredient);
	    }

	    

		public String getRef_repas() {
			return ref_repas;
		}

		public void setRef_repas(String ref_repas) {
			this.ref_repas = ref_repas;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Ingredient> getIngredients() {
			return ingredients;
		}

		public void setIngredients(List<Ingredient> ingredients) {
			this.ingredients = ingredients;
		}

	
}

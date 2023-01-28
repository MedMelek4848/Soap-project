package metiers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entites.Commande;
import entites.Ingredient;
import entites.Repas;

public class ICommandeMetierImpl implements ICommandeMetier {
    // Déclarez deux listes, une pour les objets Repas et une pour les objets Commande
    private List<Repas> repass;
    private List<Commande> commandes;

    private void initialiser() {
        // Initialisez la liste repass
        repass = new ArrayList<Repas>();
        commandes = new ArrayList<Commande>();

        // Création du premier repas
        Repas r = new Repas();
        r.setRef_repas("R001");
        r.setDescription("Tomate");
        r.setDate(new Date());
        
        // Ajout des ingrédients pour le repas
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient ing = new Ingredient("I001", "Tomate", 2, "kg");
        ingredients.add(ing);
        ing = new Ingredient("I002", "Mozzarella", 1, "kg");
        ingredients.add(ing);
        ing = new Ingredient("I003", "Farine", 1, "kg");
        ingredients.add(ing);
        ing = new Ingredient("I004", "Huile d'olive", 0.5, "L");
        ingredients.add(ing);
        r.setIngredients(ingredients);
        repass.add(r);

        // Ajout d'un log pour indiquer qu'un repas a été ajouté à la liste
        System.out.println("Repas ajouté à la liste : " + r.getRef_repas() + " - " + r.getDescription());
        
        // Création du deuxième repas
        //...
        r = new Repas();
        r.setRef_repas("R002");
        r.setDescription("Poulet Tandoori");
        r.setDate(new Date());


        // Ajout des ingrédients pour le repas
        List<Ingredient> ingredients1 = new ArrayList<Ingredient>();
        ing = new Ingredient("I005", "Poulet", 1, "kg");
        ingredients1.add(ing);
        ing = new Ingredient("I006", "Yogourt", 0.5, "L");
        ingredients1.add(ing);
        ing = new Ingredient("I007", "Cumin", 2, "cuillères à soupe");
        ingredients1.add(ing);
        ing = new Ingredient("I008", "Coriandre", 2, "cuillères à soupe");
        ingredients1.add(ing);
        r.setIngredients(ingredients1);
        repass.add(r);
        
        // Ajout d'un log pour indiquer qu'un repas a été ajouté à la liste
        System.out.println("Repas ajouté à la liste : " + r.getRef_repas() + " - " + r.getDescription());
        
        // Création du troisième repas
        r = new Repas();
        r.setRef_repas("R003");
        r.setDescription("Sushi");
        r.setDate(new Date());
        
        // Ajout des ingrédients pour le repas
        List<Ingredient> ingredients2 = new ArrayList<Ingredient>();
        ing = new Ingredient("I009", "Riz", 1, "kg");
        ingredients2.add(ing);
        ing = new Ingredient("I010", "Thon", 0.5, "kg");
        ingredients2.add(ing);
        ing = new Ingredient("I011", "Avocat", 2, "pièces");
        ingredients2.add(ing);
        ing = new Ingredient("I012", "Algue Nori", 1, "feuille");
        ingredients2.add(ing);
        r.setIngredients(ingredients2);
        repass.add(r);
        
        // Ajout d'un log pour indiquer qu'un repas a été ajouté à la liste
        System.out.println("Repas ajouté à la liste : " + r.getRef_repas() + " - " + r.getDescription());
        
        // Création du quatrième repas
        //...
        r = new Repas();
        r.setRef_repas("R004");
        r.setDescription("Tajine de poulet");
        r.setDate(new Date());

        // Ajout des ingrédients pour le repas
        List<Ingredient> ingredients3 = new ArrayList<Ingredient>();
        ing = new Ingredient("I013", "Poulet", 1, "kg");
        ingredients3.add(ing);
        ing = new Ingredient("I014", "Oignons", 2, "pièces");
        ingredients3.add(ing);
        ing = new Ingredient("I015", "Carottes", 2, "pièces");
        ingredients3.add(ing);
        ing = new Ingredient("I016", "Pâte de tomate", 0.5, "kg");
        ingredients3.add(ing);
        r.setIngredients(ingredients3);
        repass.add(r);
        
        // Ajout d'un log pour indiquer qu'un repas a été ajouté à la liste
        System.out.println("Repas ajouté à la liste : " + r.getRef_repas() + " - " + r.getDescription());
        
       
			
     // Création du cinquième repas
			 r = new Repas();
			r.setRef_repas("R005");
			r.setDescription("Lasagnes Bolognaise");
			r.setDate(new Date());
	        // Ajout des ingrédients pour le repas
			 List<Ingredient> ingredients4 = new ArrayList<Ingredient>();

			 ing=new Ingredient("I017", "Pâtes à lasagnes", 1, "kg");
			 ingredients4.add(ing);
			 ing=new Ingredient("I018", "Boeuf haché", 1, "kg");
			 ingredients4.add(ing);
			 ing=new Ingredient("I019", "Tomate", 2, "pièces");
			 ingredients4.add(ing);
			 ing=new Ingredient("I020", "Fromage râpé", 0.5, "kg");
			 ingredients4.add(ing);
			r.setIngredients(ingredients4);
			repass.add(r);
	
	
	    };

		public ICommandeMetierImpl() {
			super();
			initialiser();
		}
	  
		@Override
		public List<Repas> consulterRepas(String des) {
			// TODO Auto-generated method stub
			 List<Repas> repasDuJour = new ArrayList<Repas>();
		        for (Repas ai : repass) {
		            if (ai.getDescription().contains(des)) {
		            	repasDuJour.add(ai);
		            }
		        }
		        return repasDuJour;
		    		}

		@Override
		public void passerCommande(String nom, String contact, Repas repas) {
			// TODO Auto-generated method stub
			 Commande commande = new Commande (nom, contact,repas);
			 System.out.println("Ref_Commande:  "+commande.getRefCommande()+"\n Nom Client  "+commande.getContactClient()+"\n Contact du client  "+commande.getNomClient());
			
			 
			 
			 commandes.add(commande);
		}
}

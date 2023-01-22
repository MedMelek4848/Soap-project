package metiers;

import java.util.Date;
import java.util.List;

import entites.Repas;

public interface ICommandeMetier {
	List<Repas> consulterRepas(String description);
    void passerCommande( String nom, String contact,Repas repas);
}

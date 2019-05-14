package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Diginamic02 classe zone pour répartir les animaux dans les
 *         differentes zones du zoo
 */
public abstract class Zones {

	/** nom : String */
	private String nom;
	/** listeAnimaux : List<Animal> */
	private List<Animal> listeAnimaux = new ArrayList<>();

	/**
	 * Verifie si l'animal correspond à certains critères pour pouvoir être
	 * hébergé dans la zone
	 * 
	 * @param animal
	 * @return
	 */
	public abstract boolean verifierSiHebergementPossible(Animal animal);

	/**
	 * Ajoute un animal à une zone
	 * 
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		listeAnimaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux
	 * 
	 */
	public void afficherListeAnimaux() {

		for (Animal animal : listeAnimaux) {
			System.out.println(animal.toString());
		}
	}

}

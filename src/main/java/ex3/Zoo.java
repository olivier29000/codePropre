package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zones> zones = new ArrayList<>();

	public Zoo(String nom, List<Zones> zones) {
		this.nom = nom;
		this.zones = zones;
	}

	public void addAnimal(Animal animal) {
		for (Zones zones2 : zones) {
			if (zones2.verifierSiHebergementPossible(animal)) {
				zones2.addAnimal(animal);
			}
		}
	}

	public void afficherListeAnimaux() {
		for (Zones zones2 : zones) {
			zones2.afficherListeAnimaux();
		}
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the savaneAfricaine
	 */

}

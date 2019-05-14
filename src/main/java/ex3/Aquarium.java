package ex3;

import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Zones {

	private List<Animal> listeAnimaux;
	private String nom;

	public Aquarium(String nom) {
		this.nom = nom;
		this.listeAnimaux = new ArrayList<>();
	}

	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 0.2;
	}

	@Override
	public boolean verifierSiHebergementPossible(Animal animal) {
		// TODO Auto-generated method stub
		if (animal.getType() == Types.POISSON) {
			return true;
		} else {
			return false;
		}
	}
}

package ex3;

import java.util.ArrayList;
import java.util.List;

public class FermeReptile extends Zones {

	private List<Animal> listeAnimaux;
	private String nom;

	public FermeReptile(String nom) {
		this.nom = nom;
		this.listeAnimaux = new ArrayList<>();
	}

	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 0.1;
	}

	@Override
	public boolean verifierSiHebergementPossible(Animal animal) {
		// TODO Auto-generated method stub
		if (animal.getType() == Types.REPTILE) {
			return true;
		} else {
			return false;
		}
	}
}

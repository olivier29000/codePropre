package ex3;

import java.util.ArrayList;
import java.util.List;

public class SavaneAfricaine extends Zones {

	private List<Animal> listeAnimaux;
	private String nom;

	public SavaneAfricaine(String nom) {
		this.nom = nom;
		this.listeAnimaux = new ArrayList<>();
	}

	public int compterAnimaux() {
		return listeAnimaux.size();
	}

	public int calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 10;
	}

	@Override
	public boolean verifierSiHebergementPossible(Animal animal) {
		// TODO Auto-generated method stub
		if (animal.getType() == Types.MAMMIFERE && animal.getComportements() == Comportements.HERBIVORE) {
			return true;
		} else {
			return false;
		}
	}
}

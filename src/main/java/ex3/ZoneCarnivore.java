package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore extends Zones {

	private List<Animal> listeAnimaux;
	private String nom;

	public ZoneCarnivore(String nom) {
		this.nom = nom;
		this.listeAnimaux = new ArrayList<>();
	}

	public double calculerKgsNourritureParJour() {
		return listeAnimaux.size() * 10;
	}

	@Override
	public boolean verifierSiHebergementPossible(Animal animal) {
		// TODO Auto-generated method stub

		if (animal.getType() == Types.MAMMIFERE && animal.getComportements() == Comportements.CARNIVORE) {
			return true;
		} else {
			return false;
		}

	}
}

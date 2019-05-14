package ex3;

import java.util.Arrays;

public class ZooApplication {

	public static void main(String[] args) {
		SavaneAfricaine savaneAfricaine = new SavaneAfricaine("savane");
		Aquarium aquarium = new Aquarium("de l'eau");
		FermeReptile fermeReptile = new FermeReptile("les serpents");
		ZoneCarnivore zoneCarnivore = new ZoneCarnivore("la viande");
		Zoo zoo = new Zoo("Thoiry", Arrays.asList(savaneAfricaine, aquarium, fermeReptile, zoneCarnivore));

		zoo.addAnimal(new Animal("Gazelle", Types.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", Types.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Types.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", Types.MAMMIFERE, Comportements.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Types.POISSON, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", Types.POISSON, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", Types.REPTILE, Comportements.CARNIVORE));
		zoo.addAnimal(new Animal("Python", Types.REPTILE, Comportements.CARNIVORE));

		zoo.afficherListeAnimaux();
	}

}

package ex3;

public enum Comportements {
	CARNIVORE(1, "Carnivore"), HERBIVORE(2, "Herbivore");

	private String comportementAnimal;
	private int codeAnimal;

	/**
	 * Constructeur
	 * 
	 * 
	 * 
	 * @param codePizza
	 * @param typeDePizza
	 */
	private Comportements(int codeAnimal, String comportementAnimal) {
		this.comportementAnimal = comportementAnimal;
		this.codeAnimal = codeAnimal;
	}
}

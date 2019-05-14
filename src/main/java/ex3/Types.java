package ex3;

public enum Types {

	MAMMIFERE(1, "Mammifere"), POISSON(2, "Poisson"), REPTILE(3, "Reptile");

	private String typeAnimal;
	private int codeAnimal;

	/**
	 * Constructeur
	 * 
	 * 
	 * 
	 * @param codePizza
	 * @param typeDePizza
	 */
	private Types(int codeAnimal, String typeAnimal) {
		this.typeAnimal = typeAnimal;
		this.codeAnimal = codeAnimal;
	}

	/**
	 * @return the typeAnimal
	 */
	public String getTypeAnimal() {
		return typeAnimal;
	}

	/**
	 * Setter
	 * 
	 * @param typeAnimal
	 *            the typeAnimal to set
	 */
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	/**
	 * @return the codeAnimal
	 */
	public int getCodeAnimal() {
		return codeAnimal;
	}

	/**
	 * Setter
	 * 
	 * @param codeAnimal
	 *            the codeAnimal to set
	 */
	public void setCodeAnimal(int codeAnimal) {
		this.codeAnimal = codeAnimal;
	}

}

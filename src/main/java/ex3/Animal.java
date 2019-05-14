package ex3;

public class Animal {

	private String nom;
	private Comportements comportements;
	private Types type;

	public Animal(String nom, Types type, Comportements comportements) {
		this.nom = nom;
		this.comportements = comportements;
		this.type = type;

	}

	/**
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
	 * @return the comportements
	 */
	public Comportements getComportements() {
		return comportements;
	}

	/**
	 * Setter
	 * 
	 * @param comportements
	 *            the comportements to set
	 */
	public void setComportements(Comportements comportements) {
		this.comportements = comportements;
	}

	/**
	 * @return the type
	 */
	public Types getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(Types type) {
		this.type = type;
	}

	public String toString() {

		return nom;

	}

}

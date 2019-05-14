package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/**
	 * decouvert : un découvert est autorisé seulement pour les comptes courants
	 * est un chiffre négatif
	 */
	private double decouvert;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;

	/**
	 * Constructeur de la classe CompteBancaire
	 * 
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(String type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Methode Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Methode débite un montant au solde si ce montant ne ferait pas passer le
	 * compte à découvert
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (!seraADecouvert(montant)) {
			this.solde = solde - montant;
		}
	}

	/**
	 * Methode pour savoir si le compte sera à découvert après le débit d'un
	 * montant (en paramètre)
	 * 
	 * @param montant
	 * @return
	 */
	public boolean seraADecouvert(double montant) {

		if (this.solde - montant > decouvert) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param type
	 *            représente le type de compte, LA (pour Livret A) ou CC (pour
	 *            Compte Courant)
	 * @param solde
	 *            représente le solde du compte
	 * @param decouvert
	 *            représente le découvert autorisé
	 * @param tauxRemuneration
	 *            représente le taux de rémunération du livret A
	 */
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;

	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde
	 *            the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}

package ex2;

/**
 * @author Diginamic02
 *
 */
public class LivretA extends CompteBancaire {

	/** Variable Statique CENT : int */
	public static final int CENT = 100;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur de la classe LivretA
	 * 
	 * @param type
	 * @param solde
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Methode appliquant la rémunération annuelle sur les comptes bancaires de
	 * type LivretA rémuneration=solde+solde*taux/100
	 * 
	 * @param livretA
	 */
	public void appliquerRemuAnnuelle(LivretA livretA) {
		double remuAnnuelle = livretA.getSolde() + livretA.getSolde() * livretA.getTauxRemuneration() / 100;
		livretA.setSolde(remuAnnuelle);

	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration
	 *            the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

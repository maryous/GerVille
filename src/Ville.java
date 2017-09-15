public class Ville {
	String nom;
	String pays;
	double nbHabitants;

	// le constructeur
	public Ville(String nom, String pays, double nbHabitants) {
		// initialisation des attributs
		this.nom = nom;
		this.pays = pays;
		this.nbHabitants = nbHabitants;

	}

	public void affDesc() {
		if (this.nbHabitants >= 1)
			System.out.println(this.nom + " est une ville de " + this.pays
					+ " de catégorie " + this.categorie() + "("
					+ this.nbHabitants + ") Habitants");
		else
			System.out.println(this.nom + "est une ville " + this.pays
					+ " dont le nombre est inconnu ");

	}

	// methode prive intene a la class ville
	private char categorie() {
		if (this.nbHabitants >= 1 && this.nbHabitants < 50000)
			return 'A';
		else if (this.nbHabitants >= 50000 && this.nbHabitants < 200000)
			return 'B';
		else if (this.nbHabitants >= 200000 && this.nbHabitants < 1000000)
			return 'C';
		else if (this.nbHabitants >= 1000000)
			return 'D';
		else {

			return '?';
		}

	}

}

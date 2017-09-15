public class Capitale extends Ville {

	private String president;

	public Capitale(String nom, String pays, double nbHabitants,
			String president) {
		// super pour appeler le constructeur de la class mere
		super(nom, pays, nbHabitants);
		this.president = president;

	}

	public void affDesc() {
		if (this.nbHabitants >= 1)
			System.out.println(this.nom + " est la capitale de " + this.pays
					+ " présidé par  " + this.president);
		else
			System.out.println(this.nom + "est une ville " + this.pays
					+ " dont le nombre est inconnu ");

	}

}

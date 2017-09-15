public class GereVille1 {

	public static void main(String[] args) {

		Ville ville = new Ville("Morlaix", "france", 10000);

		Ville ville2 = new Ville("Brest", "france", 10000);
		Ville ville3 = new Ville("saint brieuc", "france", 50000);
		Ville ville4 = new Ville("Plérin", "france", 100000);
		Ville ville5 = new Ville("Rennes", "france", 10000);
		ville.affDesc();
		ville2.affDesc();
		ville3.affDesc();
		ville4.affDesc();
		ville5.affDesc();

		Capitale capitale = new Capitale("paris", "france", 10000, "macron");
		capitale.affDesc();

		Capitale capitale2 = new Capitale("rabat", "Maroc", 100000, "M6");
		capitale2.affDesc();
		// ville.setNom("lolo")
		// System.out.println(ville.getNom());

		// System.out.println(capitale2.getNom());
	}

}

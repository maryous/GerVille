import java.util.ArrayList;
import java.util.Scanner;

public class GerVilles2 {

	public static void main(String[] args) {
		// declarer notre tableau
		ArrayList<Ville> listeVilles = new ArrayList<Ville>();
		// pour afficher d'une maniere infinie
		while (true) {
			listeVilles.add(saisie());
			for (Ville v : listeVilles)
				v.affDesc();
		}

	}

	public static Ville saisie() {
		String reponse;
		String nom;
		String president;
		String pays;
		double nbHabitants;

		Scanner sc = new Scanner(System.in);

		System.out.println("entrez ville");
		nom = sc.nextLine();
		System.out.println(nom + " est elle une capitale (y/n)?");
		reponse = sc.nextLine();
		System.out.println("nom pays");
		pays = sc.nextLine();
		System.out.println("entrez le nombre d'habiatnt");
		nbHabitants = sc.nextDouble();
		sc.nextLine();
		if (reponse.length() > 0 && reponse.charAt(0) == 'y') {
			System.out.println("nom president : ");
			president = sc.nextLine();
			return new Capitale(nom, pays, nbHabitants, president);
		} else
			return new Ville(nom, pays, nbHabitants);
	}

}

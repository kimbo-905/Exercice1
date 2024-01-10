import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {

		ArrayList<Personne> personnes = new ArrayList<>();


		personnes.add(new EtudiantE("Diop", "Oumou", 1998, "oumou.diop@email.com", Classe.L3));
		personnes.add(new EtudiantE("Bamba", "Babacar", 1997, "Babacar.bamba@email.com", Classe.M1));
		personnes.add(new EtudiantE("Doucoure", "Pape", 1999, "pape.douvoure@email.com", Classe.M2));


		personnes.add(new ProfesseurP("Dubois", "Paul", 1970, "paul.dubois@email.com", "JAVA"));
		personnes.add(new ProfesseurP("Sene", "Sophie", 1965, "sophie.sene@email.com", "PHP", "C#"));
		personnes.add(new ProfesseurP("Kebe", "Jean", 1980, "jean.kebe@email.com", "JAVA", "C#"));


		for (Personne personne : personnes) {
			System.out.println(personne);
			if (personne instanceof Etudiant) {
				((Etudiant) personne).inscrire();
			} else if (personne instanceof ProfesseurP) {
				((ProfesseurP) personne).enseigner();
			}
			System.out.println();
		}
	}
}
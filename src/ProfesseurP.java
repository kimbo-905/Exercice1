import java.util.HashSet;
import java.util.Set;

interface Professeur {
	void enseigner();
	void corrigeExamen();
}
class ProfesseurP extends Personne implements Professeur {
	Set<String> specialite = new HashSet<>();

	public ProfesseurP(String nom, String prenom, int anneeNaissance, String email, String... specialites) {
		super(nom, prenom, anneeNaissance, email);
		for (String specialiteItem : specialites) {
			specialite.add(specialiteItem);
		}
	}

	@Override
	public void enseigner() {
		System.out.println("Le professeur " + prenom + " " + nom + " enseigne.");
	}

	@Override
	public void corrigeExamen() {
		System.out.println("Le professeur " + prenom + " " + nom + " corrige un examen.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Spécialités: " + specialite;
	}
}

enum Classe {
		L3, M1, M2
	}
	interface Etudiant {
		void inscrire();

		void suivreCours();

		void passerExamen();

	}
class EtudiantE extends Personne implements Etudiant {
	String numeroEtudiant;
	Classe classe;
	private String numero;

	public EtudiantE(String nom, String prenom, int anneeNaissance, String email, Classe classe) {
		super(nom, prenom, anneeNaissance, email);
		this.classe = classe;
		this.numeroEtudiant = nom + nom.length() + anneeNaissance + "000" + getId();
	}

	private static int idCounter = 1;

	private int getId() {
		return idCounter++;
	}

	@Override
	public void inscrire() {
		System.out.println("Etudiant " + prenom + " " + nom + " est inscrit.");
	}

	@Override
	public void suivreCours() {
		System.out.println("Etudiant " + prenom + " " + nom + " suit des cours.");
	}

	@Override
	public void passerExamen() {
		System.out.println("Etudiant " + prenom + " " + nom + " passe un examen.");
	}

	@Override
	public String toString() {
		return super.toString() + ", Numéro Etudiant: " + numeroEtudiant + ", Classe: " + classe;
	}
}


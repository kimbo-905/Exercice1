public class Personne {

//	instances
public String nom;
	public String prenom;
	private int anneeNaissance;
	private String email;

//	constructeur
	public Personne(String nom, String prenom, int anneeNaissance, String email){
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
		this.email = email;
	}

//	settet/ getter
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}

//	methode
	@Override
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Année de naissance: " + anneeNaissance + ", Email: " + email;
	}


}

package cours.metier;

public class Personne {
    // attributes
    private String nom;
    private String prenom;
    private int age;



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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



    // methode
    public Personne() {

    }
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom: " + this.nom + ", Prenom: " + this.prenom + ", Age: " + this.age);
    }

}

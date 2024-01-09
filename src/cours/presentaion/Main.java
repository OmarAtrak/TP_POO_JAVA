package cours.presentaion;

import cours.metier.Personne;

public class Main {
    public static void main(String[] args) {
        // crrer des objet
        // objet objet p1
        Personne p1 = new Personne("atrak", "omar", 21);
        // afficher des infos d'objet p1
        p1.afficher();

        // crrer objet p2
        Personne p2 = new Personne("atrak", "saffa", 17);
        // afficher des infos d'objet p2
        p2.afficher();

        // crrer objet p3
        Personne p3 = new Personne();
        p3.setNom("idbatman");
        p3.setPrenom("youssef");
        p3.setAge(16);
        // afficher des infos d'objet p3
        System.out.println("Nom: " + p3.getNom() + ", Prenom: " + p3.getPrenom() + ", Age: " + p3.getAge());
    }
}
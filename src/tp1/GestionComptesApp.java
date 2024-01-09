package tp1;

public class GestionComptesApp {
    public static void main(String[] args) {
        // crrer des objets
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(22222, "HAJAR", 30000);

        // Retirer un montant de 19000 du premier compte
        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);


        // afficher des infos des objets
        c1.afficherCompteInfo();
        c2.afficherCompteInfo();
    }
}

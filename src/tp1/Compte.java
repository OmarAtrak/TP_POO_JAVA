package tp1;

import com.sun.nio.sctp.SctpSocketOption;

public class Compte {
    // attributs
    private long num;
    private String nomClient;
    private double solde;



    // getters et setters
    public long getNum() {
        return num;
    }
    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public double getSolde() {
        return solde;
    }



    // methodes
    public Compte() {}
    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Num: " + this.num + ", Nom Client: " + this.nomClient + ", Solde: " + this.solde);
    }

    public void retirer(double montant) {
        if(montant <= this.solde) {
            this.solde -= montant;
        }
        else {
            System.out.println("Le solde est insuffisant !!");
        }
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

}

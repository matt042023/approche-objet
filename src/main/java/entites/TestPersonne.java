package entites;


import entites2.Personne;
import entites.AdressePostale;

public class TestPersonne {
    public static void main(String[] args) {
        // Adresse
        AdressePostale adresse1 = new AdressePostale(15, "Rue Lafayette", 31000, "Toulouse");

        // Utilisation du constructeur 1 (nom + prénom)
        Personne p1 = new Personne("Martin", "Paul");

        // Utilisation du constructeur 2 (nom + prénom + adresse)
        Personne p2 = new Personne("Durand", "Claire", adresse1);

        System.out.println(p1.nom); // Martin
        System.out.println(p2.nom + " habite à " + p2.adresse.ville); // Claire habite à Toulouse
    }
}

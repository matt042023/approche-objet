package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue du Bac", 75007, "Paris");
        AdressePostale adresse2 = new AdressePostale(42, "Boulevard Haussmann", 75009, "Paris");

        Personne personne1 = new Personne("Dupont", "Jean", adresse1);
        Personne personne2 = new Personne("Durand", "Marie", adresse2);

        System.out.println(personne1.nom + " habite à " + personne1.adresse.ville);
        System.out.println(personne2.nom + " habite à " + personne2.adresse.ville);
    }
}

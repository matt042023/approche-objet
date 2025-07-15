package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        // Création d'une personne avec nom + prénom
        Personne p1 = new Personne("Martin", "Lucie");

        // Utilisation d’un setter pour l’adresse
        AdressePostale adresse1 = new AdressePostale(14, "Rue Nationale", 59000, "Lille");
        p1.setAdresse(adresse1);

        // Affichage du nom complet avec nom en majuscule
        p1.afficherNomComplet();

        // Test des getters
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Prénom : " + p1.getPrenom());
        System.out.println("Ville : " + p1.getAdresse().ville);

        // Modification du nom et prénom
        p1.setNom("Dupont");
        p1.setPrenom("Camille");

        p1.afficherNomComplet(); // DUPONT Camille
    }
}

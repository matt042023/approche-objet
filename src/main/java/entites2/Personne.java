package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur 1 : nom + prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur 2 : nom + prénom + adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
}

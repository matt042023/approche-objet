package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur nom + prénom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur nom + prénom + adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // ➕ Méthode d'affichage (nom en MAJUSCULE)
    public void afficherNomComplet() {
        System.out.println(nom.toUpperCase() + " " + prenom);
    }

    // ➕ Setter pour le nom
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // ➕ Setter pour le prénom
    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // ➕ Setter pour l'adresse
    public void setAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // ➕ Getter pour le nom
    public String getNom() {
        return nom;
    }

    // ➕ Getter pour le prénom
    public String getPrenom() {
        return prenom;
    }

    // ➕ Getter pour l'adresse
    public AdressePostale getAdresse() {
        return adresse;
    }
}

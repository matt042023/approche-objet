package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(10, "Rue Victor Hugo", 44000, "Nantes");
        AdressePostale adresse2 = new AdressePostale(25, "Avenue de la République", 75011, "Paris");

        System.out.println(adresse1.ville); // Affiche "Nantes"
        System.out.println(adresse2.ville); // Affiche "Paris"
    }
}

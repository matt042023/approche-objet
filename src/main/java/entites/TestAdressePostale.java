package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(12, "Rue des Lilas", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale(5, "Avenue Victor Hugo", 13000, "Marseille");

        System.out.println(adresse1.ville);
        System.out.println(adresse2.ville);
    }
}

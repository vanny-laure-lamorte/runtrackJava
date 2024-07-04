package job04;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(1, "Lazlo Atlas Ltd", "1 rue du Nouvel An", 1002412.1995);
        System.out.println("--- Client ---");
        client.affiche();

        Article article1 = new Article(608, "Livre", 5.45, 50);
        System.out.println("--- Article 1 ---");
        article1.affiche();
    
        // Utilisation du constructeur par copie
        Article article2 = new Article(article1); 
        article2.setReference(700); 
        article2.setDesignation("Journal");
        article2.setPrixUnitaire(3.5);
        article2.setQuantiteStock(100);
        System.out.println("--- Article 2 ---");
        article2.affiche();
    }

}

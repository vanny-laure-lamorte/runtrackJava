package job04;

import java.util.Vector;
import java.util.Scanner;

public class Commerciale {

       // Attributs
       private Vector<Article> articles;
       private Vector<Client> clients;
       private Vector<Commande> commandes;
       private Vector<Ligne> lignes;

       public static void main(String[] args) {
        afficherMenu();
       }
   
       // Constructeur
       public Commerciale() {
           articles = new Vector<>();
           clients = new Vector<>();
           commandes = new Vector<>();
           lignes = new Vector<>();
           }

        // Méthode pour passer une commande
        public void passerCommande(Commande c) {
            commandes.add(c);
        }

        // Méthode pour annuler une commande
        public void annulerCommande(Commande c) {
            commandes.remove(c);
        }

        // Méthode pour ajouter un article
        public void ajouterArticle(Article a) {
            articles.add(a);
        }

        // Méthode pour supprimer un article
        public void supprimerArticle(Article a) {
            articles.remove(a);
        }

        // Méthode pour ajouter un article
        public void ajouterClient(Client c) {
            clients.add(c);
        }

        // Méthode pour supprimer un client
        public void supprimerClient(Client c) {
            clients.remove(c);
        }

        public static void afficherMenu() {
                int userChoice; 
                String userChoiceStr;
            Scanner input = new Scanner(System.in); 
            //int choixMenu = 0; 

            // Options du Menu
            System.out.print("\n" +
                "       + + + + + + + + + + + + + + + + +\n" +
                "       +                               +\n" +
                "       +     GESTION COMMERCIALE       +\n" +
                "       +     ____________________      +\n" +
                "       +                               +\n" +
                "       +   [1] Ajouter un article      +\n" +
                "       +   [2] Supprimer un article    +\n" +
                "       +   [3] Ajouter un client       +\n" +
                "       +   [4] Supprimer un client     +\n" +
                "       +   [5] Passer une commande     +\n" +
                "       +   [6] Annuler une commande    +\n" +
                "       +   [7] Quitter                 +\n" +
                "       +                               +\n" +
                "       + + + + + + + + + + + + + + + + +\n \n");

                // Demander à l'utilisateur de choisir une option du menu             

                do {
                    System.out.print("> Veuillez choisir une option du Menu: ");
                    userChoiceStr = input.next();
                    if (userChoiceStr.matches("[0-7]")) {
                        userChoice = Integer.parseInt(userChoiceStr);
                    } else {
                        userChoice = -1;
                        System.out.println("ERREUR. Veillez entrez uniquement un chiffre entre 1 et 7."); 
                        System.out.println();                                          
                    }
                } while (userChoice < 0 || userChoice > 6);        
          
                // Afficher le choix de l'utilisateur
                System.out.println("> Vous avez choisi l'option " + userChoice +".");



                

            input.close();
        }

   
   /* public static void main(String[] args) {

        Client client1 = new Client(1, "Lazlo Atlas Ltd", "1 rue du Nouvel An", 1002412.1995);
        client1.affiche();

        Article article1 = new Article(608, "Livre", 5.45, 50);
        article1.affiche();
    
        // Utilisation du constructeur par copie
        Article article2 = new Article(article1); 
        article2.setReference(700); 
        article2.setDesignation("Journal");
        article2.setPrixUnitaire(3.5);
        article2.setQuantiteStock(100);
        article2.affiche();

        // Commande 1
        Commande commande1 = new Commande(10,20240704, client1);
        commande1.affiche();

        // Ligne
        Ligne ligne1 = new Ligne(commande1, article2, 5);        
        ligne1.affiche();

} */


}

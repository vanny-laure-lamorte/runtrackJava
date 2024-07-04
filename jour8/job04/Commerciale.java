package job04;

import java.util.Vector;
import java.util.Scanner;

public class Commerciale {

       // Attributs privés
       private Vector<Article> articles;
       private Vector<Client> clients;
       private Vector<Commande> commandes;
       private Vector<Ligne> lignes;

       // Attribut publics
       public Scanner input = new Scanner(System.in);

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
        public void passerCommande() {
            commandes.add();
            System.out.println("Commande passée avec succès !");
        }

        // Méthode pour annuler une commande
        public void annulerCommande() {
            commandes.remove();
            System.out.println("Votre commande est annulée!");
        }

        // Méthode pour ajouter un article
        public void ajouterArticle() {
    
            System.out.println("> Saisir une référence de l'article: ");
            int ajoutRef = input.nextInt();
            System.out.println("> Saisir le nom de l'article: ");
            String ajoutDesignation = input.nextLine();
            System.out.println("> Saisir le prix unitaire de l'article: ");
            double ajoutPrixUnitaire = input.nextDouble();
            System.out.println("> Saisir la quantité de stock: ");
            int ajoutQuantiteStock = input.nextInt();
        
            articles.add(new Article(ajoutRef, ajoutDesignation, ajoutPrixUnitaire, ajoutQuantiteStock));           

            System.out.println("Article ajouté avec succès !");
        }

        // Méthode pour supprimer un article
        public void supprimerArticle() {

            System.out.print("> Donnez la référence pour supprimer votre article : ");

            System.out.println("Article supprimé avec succès !");
        }

        // Méthode pour ajouter un article
        public void ajouterClient() {
            System.out.println(" > Saisir votre identifiant : ");
            int ajoutIdentite = input.nextInt();
            System.out.println(" > Saisir votre nom : ");
            String ajoutNomSocial = input.nextLine();
            System.out.println(" > Saisir votre adresse : ");
            String ajoutAdresse = input.nextLine();
            System.out.println(" > Saisir votre chiffre d'affaire : ");
            double ajoutChiffreAffaire = input.nextDouble();

            clients.add(new Client(ajoutIdentite, ajoutNomSocial, ajoutAdresse, ajoutChiffreAffaire));

            System.out.println("Client ajouté avec succès !");
        }

        // Méthode pour supprimer un client
        public void supprimerClient() {

            System.out.print("> Identité du client à supprimer : ");
            String supClient = input.nextLine();

            clients.remove( );

            System.out.println("Client supprimé avec succès !");
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
                        System.out.println("Choix INVALIDE. Veillez entrez uniquement un chiffre entre 1 et 7."); 
                        System.out.println();                                          
                    }
                } while (userChoice < 0 || userChoice > 6);        
          
                // Afficher le choix de l'utilisateur
                System.out.println("> Vous avez choisi l'option " + userChoice +".");

                Commerciale gestion = new Commerciale();

                // Utilisaton du switch pour que l'utilisateur puisse choisir entre 7 options du menu
                switch (userChoice) {
                    case 1:
                    
                        gestion.ajouterArticle();

                        break;
                    case 2:
                        gestion.supprimerArticle();

                        break;
                    case 3:
                        gestion.ajouterClient();
                        break;
                    case 4:
                        gestion.supprimerClient();

                        break;
                    case 5:
                        gestion.passerCommande();
                        break;
                    case 6:
                        gestion.annulerCommande();
                        break;
                    case 7:
                        System.out.println("A bitentot ! Fin du programme.");
                        break;

                    default:
                        System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 7.");
                }               

            input.close();
        }   
}

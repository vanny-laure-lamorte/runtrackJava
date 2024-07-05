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
        Commerciale gestion = new Commerciale();

        gestion.baseDonne();
        gestion.afficherMenu();
    }

    // Constructeur
    public Commerciale() {
        articles = new Vector<>();
        clients = new Vector<>();
        commandes = new Vector<>();
        lignes = new Vector<>();
    }

    // Méthodes pour créer une base de données
    public void baseDonne() {

        // Client
        Client client1 = new Client(1, "Lazlo Ltd", "1 rue du Nouvel An", 1002412.1995);
        clients.add(client1);
        Client client2 = new Client(2, "Atlas Ltd", "19 av. Septembre", 1000101.2023);
        clients.add(client2);

        // Article
        Article article1 = new Article(608, "Livre", 5.45, 50);
        articles.add(article1);
        Article article2 = new Article(article1);
        article2.setReference(609);
        article2.setDesignation("Journal");
        articles.add(article2);

        // Commande
        Commande commande1 = new Commande(10, 20240704, client1);
        commandes.add(commande1);
        Commande commande2 = new Commande(11, 20240703, client1);
        commandes.add(commande2);
    }

    // Méthode pour passer une commande
    public void passerCommande() {

        System.out.println(
                "--------------------\n" +
                "PASSER UNE COMMANDE \n" +
                "--------------------\n");

        // Afficher tous les noms de clients disponibles
        for (Client client : clients) {
            client.affiche();
        }        
                
        System.out.print("> Identité du client: ");
        int identiteClient = input.nextInt();
        System.out.print("> Numero de commande: ");
        int nouvelleNumeroCommande = input.nextInt();
        System.out.print("> Date de commande: ");
        int nouvelleDateCommande = input.nextInt();

        // Trouver le client avec l'identité fournie
        Client client = null;
        for (Client c : clients) {
            if (c.getIdentite() == identiteClient) {
                client = c;
                break;
            }
        }

        // S'assurer que le client existe
        if (client != null) {
            commandes.add(new Commande(nouvelleNumeroCommande, nouvelleDateCommande, client));
            System.out.println("Commande passée avec succès !");
        } else {
            System.out.println("Client introuvable !");
        }
    }

    // Méthode pour annuler une commande
    public void annulerCommande() {

        System.out.println("--------------------\n" +
                "ANNULER UNE COMMANDE \n" +
                "--------------------\n");

        // Afficher toutes les commandes de la liste
        for (Commande commande : commandes) {
            commande.affiche();
        }

        // Demander à l'utilisateur quelle commande il souhaite annuler
        System.out.print("> Numero de commande à annuler: ");
        int numeroCommande = input.nextInt();

        boolean found = false;
        for (int i = 0; i < commandes.size(); i++) {
            if (commandes.get(i).getNumeroCommande() == numeroCommande) {
                commandes.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Votre commande est bien annulée!");
        } else {
            System.out.println("Commande introuvable!");
        }
    }

    // Méthode pour ajouter un article
    public void ajouterArticle() {

        System.out.println("--------------------\n" +
                "AJOUTER UN ARTICLE \n" +
                "--------------------\n");

        System.out.print("> Saisir une référence de l'article: ");
        int ajoutRef = input.nextInt();
        input.nextLine();
        System.out.print("> Saisir le nom de l'article: ");
        String ajoutDesignation = input.nextLine();
        System.out.print("> Saisir le prix unitaire de l'article: ");
        double ajoutPrixUnitaire = input.nextDouble();
        System.out.print("> Saisir la quantité de stock: ");
        int ajoutQuantiteStock = input.nextInt();

        articles.add(new Article(ajoutRef, ajoutDesignation, ajoutPrixUnitaire, ajoutQuantiteStock));

        System.out.println("Article ajouté avec succès !");
    }

    // Méthode pour supprimer un article
    public void supprimerArticle() {

        System.out.println("--------------------\n" +
                "SUPPRIMER UN ARTICLE \n" +
                "--------------------\n");

        // Afficher tous les articles de la liste
        for (Article article : articles) {
            article.affiche();
        }

        // Demande à l'utilisateur de saisir l'article à supprimer
        System.out.print("> Donnez la référence pour supprimer votre article : ");
        int supReference = input.nextInt();

        boolean found = false;
        for (Article article : articles) {
            if (supReference == article.getReference()) {
                articles.remove(article);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Article supprimé avec succès !");
        } else {
            System.out.println("ERREUR. Article introuvable !");
        }
    }

    // Méthode pour ajouter un article
    public void ajouterClient() {

        System.out.println("------------------\n" +
        "AJOUTER UN CLIENT \n" +
        "------------------\n"); 

        System.out.print(" > Saisir votre identifiant : ");
        int ajoutIdentite = input.nextInt();
        input.nextLine();
        System.out.print(" > Saisir votre nom : ");
        String ajoutNomSocial = input.nextLine();
        System.out.print(" > Saisir votre adresse : ");
        String ajoutAdresse = input.nextLine();
        System.out.print(" > Saisir votre chiffre d'affaire : ");
        double ajoutChiffreAffaire = input.nextDouble();

        clients.add(new Client(ajoutIdentite, ajoutNomSocial, ajoutAdresse, ajoutChiffreAffaire));

        System.out.println("Client ajouté avec succès !");
    }

    // Méthode pour supprimer un client
    public void supprimerClient() {

        System.out.println("--------------------\n" +
        "SUPPRIMER UN CLIENT \n" +
        "--------------------\n");

        // Afficher tous les clients de la liste
        for (Client client : clients) {
            client.affiche();
        }

        // Demander à l'utilisateur de choisir le client à supprimer
        System.out.print("> Identité du client à supprimer : ");
        int supClient = input.nextInt();

        boolean found = false;
        for (Client client : clients) {
            if (supClient == client.getIdentite()) {
                clients.remove(client);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Client supprimé avec succès !");
        } else {
            System.out.println("ERREUR. Client introuvable !");
        }
    }

    public void afficherMenu() {

        int userChoice;
        String userChoiceStr;

        Scanner input = new Scanner(System.in);

        // Options du Menu
        do {

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
                if (userChoiceStr.matches("[1-7]")) {
                    userChoice = Integer.parseInt(userChoiceStr);
                } else {
                    userChoice = -1;
                    System.out.println("Choix INVALIDE. Veillez entrez uniquement un chiffre entre 1 et 7.");
                    System.out.println();
                }
            } while (userChoice < 1 || userChoice > 7);

            // Afficher le choix de l'utilisateur
            System.out.println("Vous avez choisi l'option " + userChoice + ".");
            System.out.println();

            // Utilisaton du switch pour que l'utilisateur puisse choisir entre 7 options du
            // menu
            switch (userChoice) {
                case 1:

                    ajouterArticle();

                    break;
                case 2:
                    supprimerArticle();

                    break;
                case 3:
                    ajouterClient();
                    break;
                case 4:
                    supprimerClient();

                    break;
                case 5:
                    passerCommande();
                    break;
                case 6:
                    annulerCommande();
                    break;
                case 7:
                    System.out.println("A bientôt ! Fin du programme. \n");
                    
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 7.");
            }

        } while (userChoice != 7);
        input.close();

    }
}

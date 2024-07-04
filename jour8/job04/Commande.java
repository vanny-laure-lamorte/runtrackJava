package job04;

public class Commande {

    // Attributs privés
    private int numeroCommande; 
    private int dateCommande; 
    private Client client; 

    // Constructeur 
    public Commande(int numeroCommande, int dateCommande, Client client) {
        this.numeroCommande = numeroCommande; 
        this.dateCommande = dateCommande; 
        this.client = client; 
    }

    // Getters
    public int getNumeroCommande (){
        return numeroCommande;       
    }

    public int getDateCommande() {
        return dateCommande;
    }

    public Client getClient() {
        return client;
    }

    // Setters
    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public void setDateCommande(int dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setClient(Client client) {
        this.client = client;
    } 

    public void affiche() {
        System.out.println("--- Commande ---");
        System.out.println("> Numero de commande: " + numeroCommande);
        System.out.println("> Date de commande: " + dateCommande);
        System.out.println();
    }
    
}

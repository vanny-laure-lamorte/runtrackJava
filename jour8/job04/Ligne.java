package job04;

public class Ligne {

    // Attributs privés
    private Commande commande; 
    private Article article; 
    private int quantiteCommande;
   
    public Ligne( Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
        quantiteCommande++; 
    }

    // Getters 
    public Commande getCommande() {
        return commande;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }
    
    // Setters
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    // Méthode pour afficher les informations
    public void affiche(){
        System.out.println();
        System.out.println("------------------------");
        System.out.println("   RAPPORT DE COMMANDE   ");
        System.out.println("------------------------");
        System.out.println();
        commande.getClient().affiche();
        commande.affiche();
        article.affiche();
        System.out.println("> Quantité de commande : " + quantiteCommande);
    }

}

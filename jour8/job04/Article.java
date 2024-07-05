package job04;

public class Article {

    // Attributs Privés
    private int reference; 
    private String designation; 
    private double prixUnitaire; 
    private int quantiteStock; 

    // Attributs Publics
    public String article; 

    // Constructeur 
    public Article (int reference, String designation, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation; 
        this.prixUnitaire = prixUnitaire; 
        this.quantiteStock = quantiteStock; 
    }

      // Constructeur par copie
    public Article(Article a) {
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantiteStock = a.quantiteStock;
    }


    // Getter
    public int getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    // Setters
    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public void affiche(){
        System.out.println("--- Article ---");
        System.out.println("> Référence : " + reference);
        System.out.println("> Designation : " + designation);
        System.out.println("> Prix Unitaire : " + prixUnitaire);
        System.out.println("> Quantité de Stock : " + quantiteStock);
        System.out.println();
    }  
    
}

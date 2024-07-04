package job04;

public class Client extends Personne { 

    // Attributs
    private double chiffreAffaire; 

    // Constructeur
    public Client (int identite, String nomSocial, String adresse, double chiffreAffaire) {
        
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    // Getter
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    // Setter
    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }   
        
    // Appel à la méthode affiche() de la super-classe
    @Override
    protected void affiche() {
        super.affiche();       
        System.out.println("Chiffre d'affaire : " + chiffreAffaire);
    }
    
}

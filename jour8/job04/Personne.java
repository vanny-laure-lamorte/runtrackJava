package job04;

abstract class Personne {

    // Attributs
    protected int identite; 
    protected String nomSocial; 
    protected String adresse; 

    // Constructeur
    protected Personne (int identite, String nomSocial, String adresse){
        this.identite = identite; 
        this.nomSocial = nomSocial; 
        this.adresse = adresse; 
    }

    // Méthode pour afficher les informations
    protected void affiche(){
        System.out.println(" > Identité : " + identite);
        System.out.println(" > Nom : " + nomSocial);
        System.out.println(" > Adresse : " + adresse);
    }

    // Getters
     public int getIdentite() {
        return identite;
    }   
    
    public String getNomSocial() {
        return nomSocial;
    }

    public String getAdresse() {
        return adresse;
    }
    
    // Setters
    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    public void setAdresse(String addresse) {
        this.adresse = addresse;
    }   
    
}

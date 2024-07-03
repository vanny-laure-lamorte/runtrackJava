
package job01;

public class Rectangle {

    public double largeur; 
    public double hauteur; 

    public Rectangle (double largeur, double hauteur) {
        this.largeur = largeur; 
        this.hauteur = hauteur;
    }

    public void affiche (){
        System.out.println("1. Largeur = " + largeur);
        System.out.println("2. Hauteur = " + hauteur);
    }

}
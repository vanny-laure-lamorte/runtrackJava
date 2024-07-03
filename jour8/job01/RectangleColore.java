
package job01;

class RectangleColore extends Rectangle {

    public String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    public void affiche(){
        super.affiche();
        System.out.println("3. Couleur " + couleur);
    }

}

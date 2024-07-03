
package job01;

class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        rect.affiche();
        System.out.println();
        
        System.out.println("Test 2: ");
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");        
        rect1.affiche();     
        System.out.println();
        
        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, "rouge");
        rect2.affiche();

        System.out.println(rect1.equals(rect2)); // 1.
        System.out.println(rect2.equals(rect1)); // 2.
        System.out.println(rect1.equals(null)); // 3.
        System.out.println(rect.equals(rect1)); // 4.
        System.out.println(rect1.equals(rect)); // 5    .
    }
}
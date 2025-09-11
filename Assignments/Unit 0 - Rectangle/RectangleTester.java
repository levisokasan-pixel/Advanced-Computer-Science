public class RectangleTester {
    public static void main(String[] args) {
        
        System.out.println("--------------------");
        Rectangle rectangle = new Rectangle(4, 5);
        Rectangle otherRectangle = new Rectangle();
        System.out.println("Rectangle 1 " + rectangle.toString());
        System.out.println("Rectangle 2 " + otherRectangle.toString());
        System.out.println("--------------------");
        System.out.println("The perimeter of Rectangle 1 is " 
            + rectangle.calculatePerimeter() + ".");
        System.out.println("The perimeter of Rectangle 2 is " 
            + otherRectangle.calculatePerimeter() + ".");
        System.out.println("--------------------");
        System.out.println("The diagonal length of Rectangle 1 is " 
            + rectangle.calculateDiagonal());
        System.out.println("The diagonal length of Rectangle 2 is " 
            + otherRectangle.calculateDiagonal());
        System.out.println("--------------------");
        System.out.println("The fact that these two rectangles equal each other is " 
            + rectangle.equals(otherRectangle) + ".");
        System.out.println("--------------------");
        rectangle.setLength(2);
        rectangle.setWdith(2);
        System.out.println("Rectangle 1 now " + rectangle.toString());
        System.out.println("--------------------");
        System.out.println("The fact that these two rectangles equal each other is " 
            + rectangle.equals(otherRectangle) + ".");
        System.out.println("--------------------");
        System.out.println("The perimeter of Rectangle 1 is now " 
            + rectangle.calculatePerimeter() + ".");
        System.out.println("--------------------");
        System.out.println("The diagonal length of Rectangle 1 is now " 
            + rectangle.calculateDiagonal());
        System.out.println("--------------------");

    }
}

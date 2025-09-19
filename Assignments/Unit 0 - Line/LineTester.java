public class LineTester {
    
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope();
        boolean onLine1 = line1.isCoordinateOnLine(5, -2); 

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope();
        boolean onLine2 = line2.isCoordinateOnLine(5, -2);

        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println("---------------------");
        System.out.println("Slope of line 1: " + slope1);
        System.out.println("Slope of line 2: " + slope2);
        System.out.println("---------------------");
        System.out.println("The fact that the coordinates " + line1.getCoordinates(5, -2) 
            + " are on line 1 is " + onLine1 + ".");
        System.out.println("The fact that the coordinates " + line2.getCoordinates(5, -2) 
            + " are on line 2 is " + onLine2 + ".");
    }
}

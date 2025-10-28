public class LineTester {
    
    public static void main(String[] args) {

        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);

        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope();
        boolean onLine1 = line1.isCoordinateOnLine(p1); 

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope();
        boolean onLine2 = line2.isCoordinateOnLine(p2);

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
        Line pointLine = new Line(p1, p2);
        System.out.println("---------------------");
        System.out.println("Slope for pointLine: ");
        System.out.println(pointLine.calculateSlope());
        System.out.println(pointLine.calculateSlopeFromPoints());
        System.out.println("Are they equal?");
        System.out.println(pointLine.calculateSlope() == pointLine.calculateSlopeFromPoints());
        System.out.println("---------------------");
        System.out.println("Are these points on the pointLine (p1, p2, p3, p4)?");
        System.out.println("p1: " + pointLine.isCoordinateOnLine(p1));
        System.out.println("p2: " + pointLine.isCoordinateOnLine(p2));
        System.out.println("p3: " + pointLine.isCoordinateOnLine(p3));
        System.out.println("p4: " + pointLine.isCoordinateOnLine(p4));
    }
}

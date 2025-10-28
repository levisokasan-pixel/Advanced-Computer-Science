public class Line {

    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY()); 
        this.b = p2.getX() - p1.getX(); 
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int input) {
        a = input;
    }

    public void setB(int input) {
        b = input;
    }

    public void setC(int input) {
        c = input;
    }

    public double calculateSlope() {
        return ((double) -a) / b;
    }

    public double calculateSlopeFromPoints() {
        return (((double) p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
    }

    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } 
        return false;  
    }

    public String getCoordinates(int x, int y) {
        return "(" + x + ", " + y + ")";
    }

    public String generatePointSlopeFormula() {
        return "(" + "y - " + p1.getY() + ")" + " = " + calculateSlopeFromPoints() 
            + "(x - " + p1.getX() + ")";
    }
    
    public String toString() {
        if (b > 0 && c > 0) {
            return "Equation: " + a + "x + " + b + "y + " + c;
        } else if (b < 0 && c > 0) {
            return "Equation: " + a + "x " + b + "y + " + c;
        } else if (b < 0 && c < 0) {
            return "Equation: " + a + "x " + b + "y " + c;
        } else {
            return "Equation: " + a + "x + " + b + "y " + c;
        }
    }
    
}


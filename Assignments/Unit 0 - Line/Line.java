public class Line {

    private int a;
    private int b;
    private int c;

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

    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        } 
        return false;  
    }

    public String getCoordinates(int x, int y) {
        return "(" + x + ", " + y + ")";
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


public class Rectangle {
    
    private int length;
    private int width;

    public Rectangle(int inputLength, int inputWidth) {
        length = inputLength;
        width = inputWidth;
    }

    public Rectangle() {
        length = 6;
        width = 7;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int changedLength) {
        length = changedLength;
    }

    public void setWdith(int changedWidth) {
        length = changedWidth;
    }

    public String toString() {
        return "has a length of " + length + " and a width of " 
            + width + ". It's area is " + length * width + ".";
    }

    public int calculateArea() {
        return length * width;
    }

    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width; 
    }

    public int calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    public double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }

}

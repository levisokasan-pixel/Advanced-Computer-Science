public class Rectangle {
    
    private int length;
    private int width;

    public Rectangle(int inputLength, int inputWidth) {
        length = inputLength;
        width = inputWidth;
    }
    
    public Rectangle() {
        int length = 1;
        int width = 4;
    }

    public int getLength() {
        return length;
    }
    
    public int getWidth() {
        return width;
    }

    public void setLength(int input) {
        length = input;
    }

    public void setWidth(int input) {
        width = input;
    }

    public String toString(int length, int width) {
        return "This rectangle has a length of " + length + " and a width of " + width + ". It's area is " + length * width + ".";
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    // public boolean equals(Rectangle) {

    // }

    public int calculatePerimeter(int length, int width) {
        return 2 * length + 2 * width;
    }

}

public class TriangleLoopsTester {
    public static void main(String[] args) {
        System.out.println(TriangleLoops.createLetterTriangleUp(8, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(4, 'D'));

        System.out.println(TriangleLoops.createLetterTriangleDown(8, 'A'));
        System.out.println(TriangleLoops.createLetterTriangleUp(4, 'D'));

        System.out.println(TriangleLoops.createNumbersTriangle(8));
        System.out.println(TriangleLoops.createNumbersTriangle(4));

        System.out.println(TriangleLoops.createAlphabetTriangle(8));
        System.out.println(TriangleLoops.createAlphabetTriangle(28));
        
        System.out.println(TriangleLoops.createLetterTriangleUp(-3, 'D'));
    }
}

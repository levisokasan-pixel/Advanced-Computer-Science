public class Utils {

    public static void main(String[] args) {
        // string is just a class that contains a list of characters to form words
        // gives strings methods we can use
        String x = "hello";
        String.valueOf("123"); // converts String to int

        int y = 10; // ints do not have any methods, primitive (js the value)

        // INTEGER WRAPPER

        Integer yWrapper = 10; // the value 10 has methods now!

        yWrapper.toString();
        Integer.parseInt("123"); // static method, string -> int

        // BOOLEAN WRAPPER

        boolean isFalse = false;
        Boolean isTrue = true;

        isTrue.toString();
        Boolean.parseBoolean("hello"); // returns false, "true"/"false" -> true/false

        // DOUBLE WRAPPER

        double decimal = 1.1;
        Double decimalWrapper = 1.1;
        System.out.println(Double.parseDouble("13.76"));

    }
}
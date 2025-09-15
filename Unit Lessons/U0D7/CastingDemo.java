public class CastingDemo {

    public static void main(String[] args) {
        
        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to long
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to double

        // explicit casting
        // manually converting a data type, to a different data type that may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi; // truncation - lose data (decimals in this case)
        System.out.println(engineerPi);
        pi = engineerPi;
        System.out.println(pi); // cannot get data back

        long population = 30000000000L;
        int limitedPopulation = (int) population;
        System.out.println(limitedPopulation);

        int letterA = 'a';
        System.out.println(letterA + 3);

        // cannot convert int to boolean (or vice versa)

        // we're not gonna talk about casting object classes

    }
}
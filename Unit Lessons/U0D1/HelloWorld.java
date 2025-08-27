// A class is a collection of related attributes (descriptions) and behaviors (actions)

public class HelloWorld {

    // Main -> an entrypoint for your computer to start running the code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Levi");

        System.out.print("My favorite pizza topping is cheese.");
        System.out.print(" My favorite caffeinated drink is green tea.");

        // Java has 8 primite data types:
        int number = 5; // integer
        char letter = 'a'; // character
        boolean isTrue = true; // true or false
        float decimal = 50.5f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal

        // INT ALTERNATIVES
        byte age = 25;
        short population = 3200; // small number
        long bigInteger = 5000; // big number

        String myName = "Levi"; // String is a CLASS, not a primitive data type
        // a collection of PRIMITIVE characters to describe text
        System.out.println(myName.length());

        // conditional statements: if this -> that
        // conditions are always boolean (True/False)

        // example 1

        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        // example 2

        boolean isCompSciFun = true;
        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }

        // example 2 (clean)

        if (isCompSciFun) { // possible because isCompSci already has the value of true
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out.");
        }

        // Challenge: write a conditional if else statement where you do something if you ate 5
        // apples vs. 10, print if neither condition is true

        int appleCount = 6;
        // Challenge Complete 1
        if (appleCount == 5) {
            System.out.println("You ate 5 apples!");
        } else if (appleCount == 10) {
            System.out.println("You ate 10 apples!");
        } else {
            System.out.println("You ate the wrong number of apples :( ");
        }

        // Challenge Complete 2
        if (appleCount == 5 || appleCount == 10) {
            System.out.println("You ate " + appleCount + " apples.");
        } else {
            System.out.println("You ate a different amount of apples.");
        }

        // == equals
        // < less than
        // > greather than
        // <= less than or equal to
        // >= greather than or equal to


    }



}

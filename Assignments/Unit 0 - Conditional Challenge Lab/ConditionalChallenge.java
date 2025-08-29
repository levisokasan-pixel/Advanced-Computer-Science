public class ConditionalChallenge {
    public static void main(String[] args) {
        // Your code will go here
        
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 77;
        System.out.println("Initial temperature: " + temperature);
        boolean isCold = true;
        if (isCold == true) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println("isCold: " + isCold);
        System.out.println("New temperature: " + temperature);

        // Part 2: Grade Calculator
        
        System.out.println();
        System.out.println("--- Part 2: Grade Calculator ---");
        int score = 45;
        System.out.println("Score: " + score);
        if (score > 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Part 3: Leap Year Checker
        
        System.out.println()
        temperature -= 50.023;
        System.out.println("Temperature: " + temperature);
        if (temperature > 80) {
            System.out.println("Season: Summer");
        } else if (temperature >= 60 && temperature <= 80) {
            System.out.println("Season: Spring");
        } else if (temperature >= 40 && temperature <= 59) {
            System.out.println("Season: Fall");
        } else {
            System.out.println("Season: Winter");
        }

        // Part 4: Number Classifier
        
        System.out.println();
        int number = 323;
        System.out.println("Number: " + number);
        if (number > 0) {
            System.out.print("Classification: Positive, ");
        } else if (number < 0) {
            System.out.print("Classification: Negative, ");
        } else if (number == 0) {
            System.out.print("Classification: Zero, ");
        } 
        
        if (number > 100) {
            System.out.print("Large");
        } 
        
        if (number < -100) {
            System.out.print("Very Negative");
        }

        System.out.println();
    }

}

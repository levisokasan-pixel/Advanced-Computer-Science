import java.util.Scanner; // scanner class is built in within java
    // scanner class takes inputs
public class ScannerTest { 
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); // system.in accepts inputs
    
        System.out.println("What is your full government name?");
        // String governmentName = keyboard.next(); space separates the name (delimiter pattern)
        String governmentName = keyboard.nextLine(); // delimiting pattern is the next line, not the space
        System.out.println("Hello, " + governmentName + ". Nice to meet you!");

        System.out.println("What is your current age?");
        int age = keyboard.nextInt(); // same thing but for ints
        if (age >= 18) {
            System.out.println("Congratulations, you can vote!");
        } else {
            System.out.println("Come back again soon.");
        }

        System.out.println("(t/f) You will vote to make mangos mandatory for breakfast every day.");
        boolean lovesMangos = keyboard.nextBoolean();
        
        while (lovesMangos == false) {
            System.out.println("Again... You WILL vote to make mangos mandatory for breakfast every day.");
            lovesMangos = keyboard.nextBoolean();
        }

        System.out.println("Great! Thank you for supporting big mango.");

    }
}
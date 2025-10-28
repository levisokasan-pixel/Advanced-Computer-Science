public class Unit1ExercisesTester {
    public static void main(String[] args) {
        System.out.println("Testing helloName with 'John': ");
        System.out.println(Unit1Exercises.helloName("John"));

        System.out.println("\nTesting makeOutWord with '<<>>' and 'Hello': ");
        String hello = Unit1Exercises.makeOutWord("<<>>", "Hello");
        System.out.println(hello);

        System.out.println("\nTesting withoutEnd with 'Hello': ");
        System.out.println(Unit1Exercises.withoutEnd("Hello"));

        System.out.println("\nTesting comboString with 'Hello' and 'Goodbye': ");
        System.out.println(Unit1Exercises.comboString("Hello", "Goodbye"));

        System.out.println("\nTesting left2 with 'Hello': ");
        System.out.println(Unit1Exercises.left2("Hello"));

        System.out.println("\nTesting middleThree with 'GoodbyeMan': ");
        System.out.println(Unit1Exercises.middleThree("Goodbyeman"));

        System.out.println("\nTesting withoutEnd2 with 'Hello': ");
        System.out.println(Unit1Exercises.withoutEnd2("Hello"));

        System.out.println("\nTesting stringEnds with 'Hello' and 2: ");
        System.out.println(Unit1Exercises.stringEnds("Hello", 2));

        System.out.println("\nTesting hasBad with 'xxxxbadxxxx': ");
        System.out.println(Unit1Exercises.hasBad("xxxxbadxxxx"));

        System.out.println("\nTesting countVowels with 'AISLE': ");
        System.out.println(Unit1Exercises.countVowels("AISLE"));

        System.out.println("\nTesting countCode with 'codexxxxxxcope': ");
        System.out.println(Unit1Exercises.countCode("codexxxxxxcope"));
        
    }
}

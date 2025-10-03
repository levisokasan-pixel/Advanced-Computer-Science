public class DogTester {
    public static void main(String[] args) {
        Dog sigmaDog = new Dog("Sigma", "Ultra Sigma", 1, 067);
        Dog defaultDog = new Dog();
        Dog maleDog = new Dog("Cooli", "Kouli", 19, 163);

        System.out.println("---------- Original toString ----------");
        System.out.println(sigmaDog.toString());
        System.out.println(defaultDog.toString());
        System.out.println(maleDog.toString());
        System.out.println("---------- Updated toString ----------");
        System.out.println(sigmaDog.toString());
        System.out.println(defaultDog.toString());
        System.out.println(maleDog.toString());
        System.out.println("---------- Printing Dog Chars ----------");
        sigmaDog.setDogId(123);
        maleDog.setDogId(693);
        System.out.println("Dog Char for Id 123: " + sigmaDog.getDogChar());
        System.out.println("Dog Char for Id 199: " + defaultDog.getDogChar());
        System.out.println("Dog Char for Id 693: " + maleDog.getDogChar());
        System.out.println("---------- Printing Dog Tags ----------");
        System.out.println("Id 123: " + sigmaDog.generateDogTag());
        System.out.println("Id 199: " + defaultDog.generateDogTag());
        System.out.println("Id 693: " + maleDog.generateDogTag());
        System.out.println("---------- Updated toString ----------");
        System.out.println(sigmaDog.toString());
        System.out.println(defaultDog.toString());
        System.out.println(maleDog.toString());
        System.out.println("---------- Checking equals() ----------");
        System.out.println("The fact " + sigmaDog.getName() + " equals " + defaultDog.getName() + " is " + sigmaDog.equals(defaultDog));
        System.out.println("The fact " + maleDog.getName() + " equals " + defaultDog.getName() + " is " + maleDog.equals(defaultDog));
        Dog defaultDogTwo = new Dog();
        System.out.println("The fact " + defaultDog.getName() + " equals " + defaultDogTwo.getName() + " is " + defaultDog.equals(defaultDogTwo));
        System.out.println("---------- A dog leaves facility ----------");
        sigmaDog.setStillInFacility(false);
        System.out.println(sigmaDog.toString());
        System.out.println("---------- Testing Dog Chars ----------");
        System.out.println("Dog char for 123: " + Dog.generateDogChar(123));
        System.out.println("Dog char for 456: " + Dog.generateDogChar(456));
        System.out.println("Dog char for 789: " + Dog.generateDogChar(789));
        System.out.println("---------- Dogs get picked up ----------");  
        Dog layla = new Dog("Layla", "Maria", 20, 444);
    }

}

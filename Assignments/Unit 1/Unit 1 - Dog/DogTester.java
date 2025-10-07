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
        System.out.println("Id 123: " + PawesomeUtils.generateDogTag(123, 'L'));
        System.out.println("Id 199: " + PawesomeUtils.generateDogTag(199, 'K'));
        System.out.println("Id 693: " + PawesomeUtils.generateDogTag(693, 'K'));
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
        System.out.println("Dog char for 123: " + PawesomeUtils.generateDogChar(123));
        System.out.println("Dog char for 456: " + PawesomeUtils.generateDogChar(456));
        System.out.println("Dog char for 789: " + PawesomeUtils.generateDogChar(789));
        System.out.println("---------- Dogs get picked up ----------");  
        Dog layla = new Dog("Layla", "Maria", 20, 444);
        System.out.println(PawesomeUtils.pickup(layla, "Maria"));
        System.out.println("The fact the dog is still in the facility is " + layla.isStillInFacility());
        PawesomeUtils.checkIn(layla, "Maria");
        System.out.println(PawesomeUtils.pickup(layla, "John"));
        System.out.println("The fact the dog is still in the facility is " + layla.isStillInFacility());
        System.out.println("---------- Dogs get checked in ----------");  
        Dog eColi = new Dog("E Coli", "Bacterium", 11, 656);
        eColi.setStillInFacility(false);
        System.out.println("The fact the dog is still in the facility is " + eColi.isStillInFacility());
        PawesomeUtils.checkIn(eColi, "Bacterium");
        System.out.println("Dog has been checked in.");
        System.out.println("The fact the dog is still in the facility is " + eColi.isStillInFacility());
        System.out.println("E Coli's owner is " + eColi.getOwnerName());
        System.out.println("---------- Validating dogId ----------");  
        System.out.println("Dog Id 239 (returns same # if works): " + PawesomeUtils.validateDogId(239));
        System.out.println("Dog Id 555 (returns same # if works): " + PawesomeUtils.validateDogId(555));
        System.out.println("Dog Id 066 (returns same # if works): " + PawesomeUtils.validateDogId(066));
        System.out.println("Dog Id 1000 (returns same # if works): " + PawesomeUtils.validateDogId(1000));
        System.out.println("---------- Validating dogTag ----------");
        Dog blackPlague = new Dog("Black Death", "Bacterium", 800, 444);
        Dog flu = new Dog("Flu", "Bacterium", 110, 557);
        Dog covid = new Dog("Covid", "Bacterium", 3, 888);
        System.out.println("Does this Dog Tag work (true if yes): " + blackPlague.validateDogTag(blackPlague.getDogTag()));


    }

}

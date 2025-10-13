public class PawesomeUtils {
    
    public static char generateDogChar(int dogId) {
        int numOne = dogId / 100;
        int numTwo = dogId / 10 % 10;
        int numThree = dogId % 10;
        return (char) ((numOne + numTwo + numThree) % 10 + 'F');
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName() == personName) {
            dog.setStillInFacility(false);
            return dog.getOwnerName() + " has been picked up by their owner " + personName;
        } else {
            return personName + " is not the owner. You can't pick up this dog.";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        dog.setStillInFacility(true);
        dog.setOwnerName(personName);
        if (PawesomeUtils.validateDogTag(dog) == false) {
            System.out.println("Your dog is counterfeit!");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return dogId + "" + dogChar;
    }  

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * (999 - 100) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        String newDogTag = dog.getDogId() + "" + generateDogChar(validateDogId(dog.getDogId()));
        int isTrue = newDogTag.compareTo(dog.getDogTag());
        if (isTrue == 0) {
            return true;
        } else {
            dog.setDogId(PawesomeUtils.validateDogId(dog.getDogId()));
            return false;
        }
        
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + ((dog.getAge() - 2) * 5);
        }
    }

    public static int convertAgeToDogAge(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24 && humanYears > 15) {
            return 2;
        } else {
            return ((humanYears - 24) / 5) + 2;
        }
    }


}

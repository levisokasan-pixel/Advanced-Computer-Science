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
        String newDogTag = "" + generateDogChar(validateDogId(dog.getDogId()));
        int isTrue = newDogTag.compareTo(dog.getDogTag());
        if (isTrue == 0) {
            return true;
        } else {
            return false;
        }


    }


}

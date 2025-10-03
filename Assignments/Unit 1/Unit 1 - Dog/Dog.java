public class Dog {

    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;
    
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
    }

    public Dog() {
        name = "John";
        ownerName = "Johnson";
        age = 0;
        dogId = 199;
        this.dogChar = Dog.generateDogChar(this.dogId);
        this.dogTag = generateDogTag();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
        dogChar = generateDogChar(dogId);
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {

        String partOne = name + " is a good dog. They are " + age 
                + " years old and belong to " + ownerName;
            String partTwoOne = ". They are currently in our facility. For employee use only: DogTag is ";
            String partTwoTwo = ". They are currently not in our facility. For employee use only: DogTag is ";

        if (stillInFacility == true) {
            return partOne + partTwoOne + dogTag + ".";
        } else {
            return partOne + partTwoTwo + dogTag + ".";
        }
    }

    public boolean equals(Dog other) {
        return (this.name.equals(name) && this.ownerName.equals(other.ownerName) 
            && this.age == other.age 
                && this.dogId == other.dogId && this.dogChar == other.dogChar 
                    && this.dogTag.equals(other.dogTag) 
                        && this.stillInFacility == other.stillInFacility); 
    }


    public static char generateDogChar(int dogId) {
        int numOne = dogId / 100;
        int numTwo = dogId / 10 % 10;
        int numThree = dogId % 10;
        return (char) ((numOne + numTwo + numThree) % 10 + 'F');
    }

    public String generateDogTag() {
        return dogId + "" + dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.ownerName == personName) {
            dog.stillInFacility = false;
        return dog.name + " has been picked up by their owner " + personName;
        }
        return "You are not the owner. You can't pick up this dog.";
    }

    public static void checkIn(Dog dog, String personName) {
        dog.stillInFacility = true;
        dog.ownerName = personName;
    }
    
}
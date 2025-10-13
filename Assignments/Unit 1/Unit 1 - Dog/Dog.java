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
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    public Dog() {
        name = "John";
        ownerName = "Johnson";
        age = 0;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
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
        if (dogId <= 100 || dogId >= 999) {
            this.dogId = PawesomeUtils.validateDogId(dogId); 
        }
        this.dogId = dogId;
        this.dogChar = PawesomeUtils.generateDogChar(dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        dogChar = PawesomeUtils.generateDogChar(dogId);
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
        String partTwoOne = ". They are currently in our facility." 
            + " For employee use only: DogTag is ";
        String partTwoTwo = ". They are currently not in our facility." 
                + "For employee use only: DogTag is ";

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
    
}
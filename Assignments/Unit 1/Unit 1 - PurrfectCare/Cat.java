public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;


    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = moodLevel;
        this.catId = catId;
        isHungry = true;
        catChar = PurrfectUtils.generateCatChar(this.catId);
    }


    public Cat() {
        name = "Default Name";
        ownerName = "Default Owner";
        moodLevel = 10;
        catId = "1111";
        isHungry = true;
        catChar = PurrfectUtils.generateCatChar(catId);
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


    public int getMoodLevel() {
        return moodLevel;
    }


    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }


    public String getCatId() {
        return catId;
    }


    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }


    public char getCatChar() {
        return catChar;
    }


    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }


    public boolean isHungry() {
        return isHungry;
    }


    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return catId + PurrfectUtils.generateCatChar(catId);
    }

    public String toString() {
        return "== ABOUT " + name.toUpperCase() + " ==\n" + name 
            + " is a cat.\nTheir tag is " + generateCatTag() 
                + "\n" + PurrfectUtils.determineCatMood(this);
    }


    public boolean equals(Cat other) {
        return this.name.equals(other.name) && this.ownerName.equals(other.ownerName) 
            && this.moodLevel == other.moodLevel && this.catId.equals(other.catId)
                && this.catChar == other.catChar && this.isHungry == other.isHungry;
    }

    
}
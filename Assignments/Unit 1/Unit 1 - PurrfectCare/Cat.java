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


    public boolean getIsHungry() {
        return isHungry;
    }


    public void setIsHungry(boolean isHungry) {
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
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ownerName == null) {
            if (other.ownerName != null)
                return false;
        } else if (!ownerName.equals(other.ownerName))
            return false;
        if (moodLevel != other.moodLevel)
            return false;
        if (catId == null) {
            if (other.catId != null)
                return false;
        } else if (!catId.equals(other.catId))
            return false;
        if (catChar != other.catChar)
            return false;
        if (isHungry != other.isHungry)
            return false;
        return true;
    }

    
}
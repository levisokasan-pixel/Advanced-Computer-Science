public class Car {
    private String model;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        this.model = model;
        this.ownerName = AutoUtils.fixName(ownerName);
        username = AutoUtils.generateUsername(ownerName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        needsOilChange = false;
    }

    public Car() {
        model = "Prius";
        ownerName = "John Smith";
        cleanlinessLevel = 10;
        needsOilChange = false;
        username = AutoUtils.generateUsername(ownerName);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName); // check
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) { // check
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    public String toString() { // check
        String yesOrNo = "";
        if (needsOilChange == true) {
            yesOrNo = "Yes";
        } else {
            yesOrNo = "No";
        }
        return "== ABOUT CAR ==\n Model: " + model + "\nOwner: " 
            + ownerName + "\nUsername: " + username 
                + "\nCleanliness Level: " + cleanlinessLevel 
                    + "\nDoes this car need oil change?" + yesOrNo;
    }

    public boolean equals(Car other) {
        return this.ownerName.equals(other.ownerName) && this.cleanlinessLevel 
            == other.cleanlinessLevel && this.model.equals(other.model)
                && this.needsOilChange == other.needsOilChange;
    } 
}
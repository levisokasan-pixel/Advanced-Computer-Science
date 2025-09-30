public class Customer {
    private String name;
    private String address;
    private int rewardPoints;

    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setName(String input) {
        name = input;
    }

    public void setAddress(String input) {
        address = input;
    }

    public void setRewardPoints(int input) {
        rewardPoints = input;
    }

    public String toString() {
        return "Customer Name: " + name + ", Address: " + address 
            + ", Reward Points: " + rewardPoints;
    }

    public boolean equals(Customer other) {
        return this.name.equals(other.name) && this.address.equals(other.address) 
            && this.rewardPoints == other.rewardPoints;
    }

    public void boostPoints(double percentage) {
        if (percentage >= 0.0 && percentage <= 100.0) {
            rewardPoints = (int) (rewardPoints + rewardPoints * ( (double) percentage/100));
        }
    }


}

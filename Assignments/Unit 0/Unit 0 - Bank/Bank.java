public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int input) {
        numberOfTellers = input;
    }

    public void setNumberOfLoanOfficers(int input) {
        numberOfLoanOfficers = input;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " 
            + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        return this.numberOfLoanOfficers == other.numberOfLoanOfficers 
            && this.numberOfTellers == other.numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOffier) {
        if (isLoanOffier) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    
}
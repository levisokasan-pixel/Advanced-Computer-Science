public class NPC {
    public String choice;

    public NPC() {
        choice = RPSGame.generateRandomChoice();  
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        if (RPSGame.validateChoice(choice)) {
            this.choice = choice;
        } else {
            choice = RPSGame.generateRandomChoice();
        }
    }
    
    public String toString() {
        return "Opponent chose " + choice + ".";
    }
    
}
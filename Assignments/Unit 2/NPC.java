public class NPC {
    public String choice;

    public NPC() {
        choice = RPSGame.generateRandomChoice();  
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
    
    public String toString() {
        return "Opponent chose " + choice;
    }
    
}
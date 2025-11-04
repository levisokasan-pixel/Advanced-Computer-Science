import java.util.Scanner;

public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public static boolean validateChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") 
            || choice.equals("scissors");
    }

    public void setPlayerValues(String name, String choice) {
        player.setChoice(choice);
        player.setName(name);
    }

    public void start() {
        
    }

    public static String generateRandomChoice() {
        int tempChoice = generateRandomNumber(0, 3);
        if (tempChoice == 0) {
            return "rock";
        } else if (tempChoice == 1) {
            return "scissors";
        } else {
            return "paper";
        }
    }

    public static int generateRandomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }
    
}


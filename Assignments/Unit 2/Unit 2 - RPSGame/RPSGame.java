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
        Scanner question =  new Scanner(System.in);
        System.out.println("What is your name?");
        String name = question.nextLine();
        System.out.println("What is your choice?");
        String choice = question.nextLine();
        if (RPSGame.validateChoice(choice)) {
            setPlayerValues(name, choice);
        } else {
            for (int i = 0; i <= 2; i++) {
                if (!validateChoice(choice)) {
                    System.out.println("What is your choice?");
                    choice = question.nextLine();
                    question.close();
                } else {
                    setPlayerValues(name, choice);
                    break;
                }
            }
        }
    }

    public boolean didPlayerWin() {
        if (player.choice.equals(opponent.choice)) {
            return false;
        } else if (player.choice.equals("rock")) {
            if (opponent.choice.equals("scissors")) {
                return true;
            } else {
                return false;
            }
        } else if (player.choice.equals("scissors")) {
            if (opponent.choice.equals("paper")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (opponent.choice.equals("scissors")) {
                return false;
            } else {
                return true;
            }
        }
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.name + "won!\n Congratulations!";
        } else {
            return "Opponent won!\n Better luck next time";
        }
    }

    public String displayResults() {
        if (didPlayerWin()) {
            return "== GAME RESULTS ==\n" + player.name + " chose " + player.choice
                + "." + "\nOpponent chose " + opponent.choice + "." + "\n" + player.name + " won!"
                    + "\nCongratulations!";
        } else {
            return "== GAME RESULTS ==\n" + player.name + " chose " + player.choice
                + "." + "\nOpponent chose " + opponent.choice + "." + "\nOpponent won!"
                    + "\nBetter luck next time!";
        }
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


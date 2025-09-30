public class Zombie {
    // methods (behaviors)
    // walk with arms out
    // eat brains
    // growl
    public String growl() {
        return "grrrrrrrrshhhhhhhhhhjj...";
    }

    // instance variables (attributes)
    // green
    String skincolor = "Green";
    // dead
    boolean isDead = true;
    // humans eaten
    int humansEaten = 0;

    // main

    public static void main(String[] args) {
        Zombie phillip = new Zombie();

        System.out.println(phillip.growl());
        System.out.println("Phillip ate " + phillip.humansConsumed() + " humans.");

        Zombie brian = new Zombie();

        System.out.println(brian.growl());

    }

    // Challenge: make a new method that returns the number of humans eaten
    public int humansConsumed() {
        return humansEaten;
    }

}

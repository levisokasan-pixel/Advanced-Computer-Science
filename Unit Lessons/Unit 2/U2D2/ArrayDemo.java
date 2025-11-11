public class ArrayDemo {
    public static void main(String[] args) {

        // Pokemon: team of 6, displays like a list, maximum index is 5
        // Pokemon[] team = new Pokemon[6];
        // This created a list of size 6 so the max index is 5

        // Pokemon[] box = new Pokemon[30];
        // Pokemon[] boxTwo = new Pokemon[100];

        // {0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new Pokemon("Charizard"); adds a new pokemon at index 3

        int[] myFavoriteNumbers = new int[4];
        myFavoriteNumbers[0] = 7; // reads like myFavoriteNumbers sub 0
        myFavoriteNumbers[1] = 8;
        myFavoriteNumbers[2] = 13;
        myFavoriteNumbers[3] = 5;

        myFavoriteNumbers[3] = 6; // rewrites it

        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // lists are immutable, you cannot change it without making a new object
        // strings are actually an array of characters

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";  could do it like this
        // beatles[1] = "Paul McCartney"; 
        String[] beatles = {"John Lennon", "Paul McCartney", "Ringo Starr", "George Harrison"};
        String[] beatles2 = new String[5];
        String[] beatles3 = {"John Lennon", "Paul McCartney", null, "George Harrison"};
        for (int i = 0; i < beatles.length; i++) {
            beatles2[i] = beatles[i];
            System.out.println(beatles3[i].length()); // set a condition that skips over null
        }
        beatles2[4] = "Levi";
    }

    int[] number = new int[3];
    // 0, 0, 0

    boolean[] trust = new boolean[3];
    // null, null, null

    String[] list = new String[3];
    // null, null, null
}
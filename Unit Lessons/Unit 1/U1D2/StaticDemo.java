public class StaticDemo {
    public static void main(String[] args) {
        
        // if you have no constructor, i'll make a default for you and assign all instance variables to their null state
        // StaticDemo object = new StaticDemo();
        // object.firstIfTest();


        // usually called helper methods
        // classes that hold static methods only are called helper classes
        String demo = StaticDemo.secondIfTest();
        System.out.println(demo);

        String.valueOf(123);
    }

    // this method belongs to the object of the class
    public void firstIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("x is less than y.");
        }
        if (x == z) {
            System.out.println("x is equal to z.");
        }
    }

    // this method belongs to the class, no object required
    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            return "x is less than y.";
        }
        if (x == z) {
            return "x is equal to z.";
        }

        return "hello there";
    }

}
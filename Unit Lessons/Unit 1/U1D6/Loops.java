public class Loops {
    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count ++;
        }

        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        for (int count2 = 0; count2 < 10; count2 ++) {
            System.out.println(count2);
        }


        // a for-loop is best when you know the exact number of iterations / repetitions
        // compact with its syntax

        // a while loop is best when you don't know the exact number of iterations
        // iteration outside of loop, iterator updated inside the loop

        do { // NOT USEFUL AT ALL; do then check
            System.out.println("do this first");
            System.out.println("then check the condition to loop");
        } while (isRunning);


        // nested loops (loops within loops)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("all work and no play makes jack a dull boy"); // prints 100 times
            }
        }
    }


}
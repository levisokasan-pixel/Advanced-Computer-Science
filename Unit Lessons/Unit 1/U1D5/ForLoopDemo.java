public class ForLoopDemo {
    
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        // ...
        System.out.println(10);


        // for(initial; condition; iterator) {
        // statement 
        // }


        // for loops allow u to repeat code
        for(int count = 1; count < 101; count ++) {
            System.out.println(count);
        }

        // For loop anatomy:
        // 1. initialize the count
        // 2. boolean condition to tell us when we stop looping
        // 3. Do statements
        // 4. Iterator -> update count for the next loop

        for (int count = 1; count < 10; count-= 100000) {
            System.out.println(count); // infinite loop (not actually infinite)
        }
    }
}
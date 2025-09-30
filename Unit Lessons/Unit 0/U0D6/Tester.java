public class Tester {
    public static void main(String[] args) {
        
        // PEMDAS (PBMEMDMASRCB)
        
        // 1. Parenthesis, Brackets, Member Access (methods)
        String demo = "hello";
        System.out.println(5 * demo.length()); // demo.length() takes priority as a method

        // 2. Exponents
        Math.pow(2, 4); // also a method, also level 1

        // 3. Multiplication, Division, Modular Arithmetic
        System.out.println(5 * 4 + (5 / 6) + 7 % 1);

        // 4. Addition, Subtraction
        System.out.println(5 + 6 - 9);

        // 5. Relational Operators
        System.out.println(6 < 7);
            // <, <=, >=, >

        // 6. Comparison Operators
        System.out.println(8 == 9);
            // ==, !=

        // 7. Boolean Operators
            // &&, ||


        System.out.println(3 + Integer.parseInt("123")*9 / 8 + 7 >= 5);
        // Challenge: the 7 order of operations
        // 1. Integer.parseInt("123") = 123
        // 2. 3 + 123 = 126
        // 3. 126 * 9 = 1134
        // 4. 1134 / 8 = 141
        // 5. 141 + 7 = 148
        // 148 >= 5 = true
        // final operation is System.out.println(), outputs true
    }
}

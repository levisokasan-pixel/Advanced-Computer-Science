public class StudentTester {
    
    public static void main(String[] args) {
        System.out.println("------------------------");
        Student freshman = new Student("James", 9);
        System.out.println(freshman.toString());

        Student sophomore = new Student("John");
        System.out.println(sophomore.toString());

        Student sophomore0 = new Student("Sarina");
        System.out.println(sophomore0.toString());

        Student senior = new Student("Katelyn", 12);
        System.out.println(senior.toString());

        System.out.println("------------------------");
        // changes all the grades by +1
        freshman.setGrade(10);
        sophomore.setGrade(11);
        sophomore0.setGrade(11);
        senior.setGrade(13);

        System.out.println("All grades have been updated by +1 unit.");
        System.out.println("------------------------");
        System.out.println(freshman.toString()); // grade should be 10

        System.out.println(sophomore.toString()); // grade should be 11

        System.out.println(sophomore0.toString()); // grade should be 11
        System.out.println(senior.toString()); // grade should be 13

        System.out.println("------------------------");
        System.out.println("The fact that " + sophomore.getName() + " and " + sophomore0.getName() + " are equal is " + sophomore.equals(sophomore0) + "."); // should output false
        System.out.println("------------------------");

    }
}

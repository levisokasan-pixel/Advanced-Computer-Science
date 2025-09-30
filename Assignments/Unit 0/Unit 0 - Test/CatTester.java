public class CatTester {
    public static void main(String[] args) {
    Cat myCat = new Cat("Betsy", "Tabby"); //1. added new
    Cat otherCat = new Cat("Tiger Beast", "Tabby"); //2. added new
    System.out.println(myCat.toString());
    System.out.println("My Cat's Name: " + myCat.getName());//3. added sout

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); //4. changed return to sout

        System.out.println("Is my cat hungry? " + myCat.getIsHungry());//5. changed print to sout

        String firstName = "Tiger";
        String lastName = "Beast"; // 6. changed == to =, not comparing
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}

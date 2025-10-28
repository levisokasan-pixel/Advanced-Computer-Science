public class CatTester {
    public static void main(String[] args) {
        Cat dog = new Cat("Dog", "Faux-Dog-Owner", 10, "8888");
        System.out.println(dog.toString() + "\n");
        System.out.println("-- Changing Values with Setters --");
        dog.setName("John");
        dog.setOwnerName("John-Owner");
        dog.setMoodLevel(3);
        dog.setCatId("5555");
        dog.setCatChar('P');
        dog.setIsHungry(false);
        System.out.println("\n" + dog.toString());
        System.out.println("\n-- Second Cat Object --\n");
        
    }
}

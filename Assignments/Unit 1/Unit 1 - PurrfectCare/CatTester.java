public class CatTester {
    public static void main(String[] args) {
        Cat dog = new Cat("Dog", "Faux-Dog-Owner", 10, "8888");
        PurrfectUtils.bootUp(dog);
        System.out.println("\n-- Changing Values with Setters --");
        dog.setName("John");
        dog.setOwnerName("John-Owner");
        dog.setMoodLevel(3);
        dog.setCatId("5555");
        dog.setHungry(false);
        PurrfectUtils.bootUp(dog);
        System.out.println("\n-- Second Cat Object --\n");
        Cat secondCat = new Cat("John", "John-Owner", 3, "5555");
        secondCat.setHungry(false);
        PurrfectUtils.bootUp(secondCat);
        System.out.println("\nAre they equal? " + secondCat.equals(dog) + "\n");

        System.out.println("\n-- Testing Methods --");

        PurrfectUtils.pet(dog);
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(dog);
        }
        System.out.println("\n");
        PurrfectUtils.cleanLitterBox(dog);
        System.out.println("\n");
        PurrfectUtils.feed(dog);
    }
}

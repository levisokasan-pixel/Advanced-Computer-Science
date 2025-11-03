public class CarTester {
    public static void main(String[] args) {
        Car newCar = new Car("Toyota", "John  Cena", 5);

        System.out.println(newCar.getOwnerName());
        System.out.println(newCar.getUsername());

        newCar.setCleanlinessLevel(15);
        System.out.println(newCar.getCleanlinessLevel());

        Car realCar = new Car("Toyota", "John  Cena", 10);
        realCar.setUsername("@john_cena_2021");
        System.out.println(realCar.equals(newCar));
        AutoUtils.fixName(realCar.getOwnerName());

    }
}

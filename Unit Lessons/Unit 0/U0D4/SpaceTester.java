public class SpaceTester {
    public static void main(String[] args) {
        // 1. instantiate a spaceship object
       
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // keyword new creates a new instance of the class (aka an object)

        // 2. ivoke a method

        String shipDescription = ship.getDescription();
        
        int shipPassengerCount = ship.getPassengerCount();

        double shipFuelLevel = ship.getFuelLevel();

        boolean shipShieldsActive = ship.getShieldsActive();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);
        System.out.println(shipShieldsActive);

        // 3. manipulate the data

        ship.setDescription("big");
        ship.setPassengerCount(30);
        ship.setFuelLevel(70.4);
        ship.setShieldsActive(false);

        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getFuelLevel());
        System.out.println(ship.getShieldsActive());

    }

}
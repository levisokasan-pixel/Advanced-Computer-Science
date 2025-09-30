public class Demo {

    private int hello;
    private int world;
    public String goodbye;

    
    public int getHello() {
        return hello;
    }


    public void setHello(int hello) {
        this.hello = hello;
    }


    public int getWorld() {
        return world;
    }


    public void setWorld(int world) {
        this.world = world;
    }


    public String getGoodbye() {
        return goodbye;
    }


    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }


    public static void main(String args[]) {
        // AND - ALL conditions have to be true
        int age = 20;
        boolean isFelon = false;

        if ((age <= 18 && age >= 35) && !isFelon) { // order of ops matters
            System.out.println("You can run for presidency and vote.");
        }

        // OR - at least one condition has to be true
        age = 15;

        if (age < 35 || isFelon || age > 101) {
            System.out.println("This person is not eligible for presidency.");
        }

        if(!(age > 18 || isFelon)) { // DeMorgan's law
            System.out.println("Print me.");
        }

        if (true) { // READABILITY IS IMPORTANT
            if (true) {
                if (true) {
                    if (true);
                }
            }
        }

        // better example (STILL NOT NICE)

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        if (isRegistered) {
            if (age >= 18) {
                if (isCitizen) {
                    if(country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        }

        // guarding if statements (GOOD EXAMPLE)
        if(!isRegistered) {
            return; // return ends the method
        }
        if (age < 18) {
            return;
        }
        if(!isCitizen) {
            return;
        }
        if(isFelon) {
            return;
        }
        if(country.equals("USA")) {
            return;
        }
        System.out.println("You can vote");

    }
}
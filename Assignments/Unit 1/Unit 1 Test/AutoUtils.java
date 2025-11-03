public class AutoUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        } else if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        } 
        return cleanlinessLevel;
    } 

    public static String generateUsername(String name) {
        if (name.indexOf(" ") > 0) {
            name = AutoUtils.fixName(name);
            String firstName = name.substring(0, name.indexOf(" "));
            String lastName = name.substring(name.indexOf(" ") + 1);
            return "@" + firstName.toLowerCase() + "_" + lastName.toLowerCase() 
                + "_" + generateRandomNumber(1950, 2050);
        } else {
            return "This name is invalid. It does not have a last name" 
                + "separated by a space.";
        }
    }

    public static void cleanCar(Car car) {
        car.setCleanlinessLevel(car.getCleanlinessLevel() + 2);
    }

    public static String fixName(String name) {
        name = name.trim(); // fix
        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));
        lastName = lastName.trim();
        firstName = firstName.trim();
        return firstName + " " + lastName;
    }

    public static int generateRandomNumber(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }
}

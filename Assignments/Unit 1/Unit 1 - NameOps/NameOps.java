public class NameOps {
    
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) < 0) {
            return -1;
        } else {
            return name.indexOf(name.substring(name.indexOf(" "))); // help
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) < 0) {
            return name; 
        } else {
            return name.substring(0, name.indexOf(" "));
        }
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) < 0) {
            return "";
        } else {
            return name.substring(name.indexOf(" ")); // help
        }
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) < 0) {
            return "";
        } else if (indexOfFirstSpace(name) > 0 && indexOfFirstSpace(name) > 0) {
            return "";
        } else {
            return name.substring(name.indexOf(" "), 
            name.indexOf(name.substring(name.indexOf(" "))));
        }
    } 

    public static String generateLastFirstMidInitial(String name) { // run for preconditions
        if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) > 0) {
            String firstName = name.substring(0, name.indexOf(" "));
            String middleInitial = name.substring(name.indexOf("") + 1);
            String lastName = name.substring(name.indexOf(name.indexOf(name.substring(name.indexOf(" "))))); 
            return lastName + "," + firstName + middleInitial;
        } else if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) < 0) {
            String firstName = name.substring(0, name.indexOf(" "));
            String lastName = name.substring(name.indexOf(name.indexOf(name.substring(name.indexOf(" "))))); 
            return lastName + "," + firstName;
        } else {
            String firstName = name.substring(0, name.indexOf(" "));
            return firstName;
        }
    }
}
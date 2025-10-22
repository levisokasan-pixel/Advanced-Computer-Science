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
        } else if (indexOfFirstSpace(name) > 0 && ((name.substring(indexOfFirstSpace(name) 
            + 1).indexOf(" ")) < 0)) {
            return -1;
        } else {
            return indexOfFirstSpace(name) + 1 
                + name.substring(indexOfFirstSpace(name) + 1).indexOf(" "); 
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
        } else if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) < 0) {
            return name.substring(name.indexOf(" ") + 1);
        } else {
            return name.substring(indexOfSecondSpace(name) + 1); 
        }
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) < 0) {
            return "";
        } else if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) < 0) {
            return "";
        } else {
            return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name));
        }
    } 

    public static String generateLastFirstMidInitial(String name) { // run for preconditions
        if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) > 0) {
            String firstName = name.substring(0, name.indexOf(" "));
            String middleInitial = name.substring(indexOfFirstSpace(name) 
                + 1, indexOfFirstSpace(name) + 2);
            String lastName = name.substring(indexOfSecondSpace(name) + 1);
            return lastName + ", " + firstName + " " + middleInitial + ".";
        } else if (indexOfFirstSpace(name) > 0 && indexOfSecondSpace(name) < 0) {
            String firstName = name.substring(0, name.indexOf(" "));
            String lastName = name.substring(indexOfFirstSpace(name) + 1); 
            return lastName + ", " + firstName;
        } else {
            return name;
        }
    }
}
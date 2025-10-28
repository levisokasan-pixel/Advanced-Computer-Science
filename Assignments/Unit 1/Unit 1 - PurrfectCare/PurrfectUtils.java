public class PurrfectUtils {
    
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() >= 7 && cat.getMoodLevel() <= 10) {
           return "Currently, " + cat.getName() 
                + " is in a great mood. \nPetting is appreciated."; 
        } else if (cat.getMoodLevel() >= 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName() 
                + " is reminiscing of a past life. \nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName() 
                + " is plotting revengeance. \nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        return (char)(Integer.parseInt(catId) % 26 + 'A');
    }

    public static int generateRandomInt(int low, int high) {
        return (int) (Math.random() * (high - low) + low);
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) >= 1000 && Integer.parseInt(catId) <= 9999) {
            return catId;
        } else {
            return "" + (generateRandomInt(1000, 9999));
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return 0;
        }
    }   

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < 2 && cat.getIsHungry() == true) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int oneOrTwo = PurrfectUtils.generateRandomInt(1, 2);
        if (oneOrTwo == 1) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...\nDone!");
        System.out.println(cat.getName() + " appreciated that.");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl...\nDone!");
        System.out.println(cat.getName() + " is eating...");
        System.out.println(cat.getName() + " is full!");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setIsHungry(false);
    }
}

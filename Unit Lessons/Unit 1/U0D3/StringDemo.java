public class StringDemo {

// in AP only use these methods from this class

    public static void main(String[] args) {
        //Strings are objects
        String fullName = "Levi Osman";
        String fullNameTwo = "Levi Osman"; // one object, two aliases for it
        fullNameTwo = "Levi Hayden Osman"; // two objects

        String fullNameThree = new String("Levi Osman"); // creates a third object
        // if the above object did not say new String(), it would just create another alias for the same object

        // string pool = list of strings that are being used
            // if something doesn't exist in the string pool, it creates a new string object

        // STRINGS ARE IMMUTABLE. ANY CHANGE CREATES A NEW STRING OBJECT
        

        System.out.println(fullName == fullNameThree);
        System.out.println(fullName == fullNameTwo);
        System.out.println(fullName.equals(fullNameThree));

        // methods 
        // charAt() -> returns the char value at the index
        System.out.println(fullName.charAt(3)); // returns "i"

        // indexOf() -> returns index of a char value
        System.out.println(fullName.indexOf("i"));

        System.out.println(fullNameTwo.indexOf("i"));

        //substring() -> returns a piece of a string given a starting and ending index

        int firstSpace = fullNameTwo.indexOf(" "); // locates the first space

        String middleLastName = fullNameTwo.substring(firstSpace); // everything after the space (including the space)

        System.out.println(middleLastName.indexOf("e")); // finds index of the "e" in middle and last name
        String middlename = fullNameTwo.substring(5, 11); // from index 5 to 12 (13-1)
        System.out.println(middlename);
        //if it returns -1, that means it doesn't exist

        // compareTo() -> returns a number depending on the order
        String abc = "abc";
        // String def = "def";
        String abd = "hbd"; // subtracts a - h, equal to -7

        System.out.println(abc.compareTo(abd)); 
        // returns negative if abc is before abd
        // returns positive if abc is after abd
        // returns 0 if strings are equal




    }
}
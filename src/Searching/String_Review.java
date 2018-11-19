package Searching;

/**
 *
 * @author feli8871
 */
public class String_Review {

    public static void main(String[] args) {
        String x="The quick brown fox jumps over the lazy dog.";
        //        01234567890123456789012345678901234567890123
        //indexOf is a method that returns and integer that represents the starting location of a character.
        int l=x.indexOf("q");
        System.out.println("The letter q is at position "+l+".");
        l=x.indexOf("o",13); //Ignores characters before the 13th position
        System.out.println("The letter o is at position "+l+" (Ignores occurances before the 13th position).");
        l=x.indexOf("q",5); //Returns a position of -1
        System.out.println("The letter q is at position "+l+" (Ignores occrances before the 5th position.");        
    
        //Returns a Character at a given position
        char c=x.charAt(13);
        System.out.println(c);
        
        //Returns that length of a String
        int len=x.length();
        System.out.println(len);
        
        //Substring returns a String that represents either a String from a certain position to the end or from one porsition to another
        String y=x.substring(10,13);
        System.out.println("Hey "+y);
        y=x.substring(16);
        System.out.println("Why does the "+y);
        
        //toLower/toUpperCase returns a string in all lowercase or uppercase letters
        System.out.println(x.toUpperCase());
        x=x.toLowerCase(); // Turning x into an improper sentence
        y="jumps over the lazy dog";
        
        //compareTo Calculates the alphabetical distance between the 1st letter of each String "t" and "j" are 10 letters apart in the alphabet
        int z=y.compareTo(x);
        System.out.println("y vs x = "+z);
        System.out.println("Bob".compareTo("Andy")); // Returns a value of 1
        System.out.println("Andy".compareTo("Bob")); // Returns a value of -1
        
        
        
    }
    
}

package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        // TODO: Write this method.

        String [] vowels = {"a", "i", "u", "e", "o", "A", "I", "U", "E", "O"};

       for (int i = 0 ; i < vowels.length ; i++){

           string = string.replace(vowels[i], "");
       }

        return string;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}

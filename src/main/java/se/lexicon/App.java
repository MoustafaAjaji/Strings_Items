package se.lexicon;

/**
 * String world!
 * String Exercise by Moustafa Ajaji
 */
public class App {
    public static void main( String[] args ) {

//what is the length of the String: "Java" ?
        String String1="JAVA";
        System.out.println(String1);
        int length_of_string=String1.length();
        System.out.println(length_of_string);  // output is 4

//What char is at index position 6 in the following String:"Long example sentence" ?
        String string_position = "Long example sentence";
        String  char_at_index_position= string_position.substring(6,7);
        System.out.println(char_at_index_position);                           //output is x

    }
}

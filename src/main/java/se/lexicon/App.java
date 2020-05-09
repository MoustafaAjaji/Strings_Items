package se.lexicon;

import java.util.Arrays;

/**
 * String world!
 * String Exercise by Moustafa Ajaji
 */
public class App {
    public static void main(String[] args) {

//what is the length of the String: "Java" ?
        String String1 = "JAVA";
        System.out.println(String1);
        int length_of_string = String1.length();
        System.out.println(length_of_string);  // output is 4

//What char is at index position 6 in the following String:"Long example sentence" ?
        String string_position = "Long example sentence";
        String char_at_index_position = string_position.substring(6, 7);
        System.out.println(char_at_index_position);     //output is x

        // What is the index position of 'o' in the following String: "Even longer example sentence" ?
        String string__index_position = "Even longer example sentence";
        int stringpos = string__index_position.indexOf('o');
        System.out.println(stringpos);   // output is 6.

//Given the following String: "Ok this is not as long!" create a substring of only "not as long" (excluding the exclamation point) and print it out
        String st2 = "Ok this is not as long!";
        String targetSt = st2.substring(11, st2.length() - 1);
        System.out.println(targetSt); // output : not as long
        //Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again.

        String st3 = "CAPS EQUALS SCREAMING";
        String lower_case_St = st3.toLowerCase();
        System.out.println("The upper case sentence is " + lower_case_St);      //CAPS EQUALS SCREAMING
        st3 = lower_case_St.toUpperCase();
        System.out.println("The upper case sentence is " + st3);                //caps equals screaming

//Correct the following String: "Java is the worst programming language!" by replacing the (obviously incorrect) word "worst" with the word "best". Then print out the sentence.

        String st4 = "Java is the worst programming language!";
        String stringarray[] = st4.split(" ");
        for (int i = 0; i < stringarray.length; i++)
            System.out.print(stringarray[i] + " ");

        for (int i = 0; i < stringarray.length; i++)
            if (stringarray[i].equalsIgnoreCase("worst"))
                stringarray[i] = "best";
        System.out.println("\n");

        for (int i = 0; i < stringarray.length; i++)          // Output will be "Java is the best programming language!"
            System.out.print(stringarray[i] + " ");
//What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?

        String stTrim = "\tJ\ta\tv\ta\t";
        System.out.println(stTrim.trim()); //Java

//Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020"
        String stInt = "";
        int pass = 20;
        String newString = String.valueOf(pass);
        System.out.print(newString);
        String stInt1 = "20";
        stInt1 = stInt.concat(newString);
        System.out.println(stInt1);

        String st9 = "Oil and Water";
        String words[] = st9.split(" ");
        String splitarray[] = new String[3];
        for (int i = 0; i < words.length; i++)
            System.out.print(words[i] + " ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and"))
                splitarray[i] = "";
            else
                splitarray[i] = words[i];
        }
        System.out.println("\n");

        for (int i = 0; i < splitarray.length; i++)                         // Output will be "Oil"
            System.out.println(splitarray[i] + " ");                 //"Water"

//Split the following String: "Carl,Susie,Fredrick,Bob,Erik" into an array. Print out all names separately

        String st5 = "Carl, Susie, Fredrick,Bob,Erik";
        String[] anarray = st5.split(",");
        for (int i = 0; i < anarray.length; i++)                              // Printing array contents :: Carl Susie Fredrick Bob Erik
            System.out.print(anarray[i] + " ");
        System.out.println("\n");

// Convert the following String: "ThisShouldBeConverted" to a char array. Iterate through the char array and print out each element
        String st6 = "ThisShouldBeConverted";
        char[] chararray = new char[st6.length()];

        for (int i = 0; i < chararray.length; i++)
            chararray[i] = st6.charAt(i);

        for (int i = 0; i < chararray.length; i++)
            System.out.print(chararray[i] + " ");
        System.out.println("\n");

        //Convert the following char[]: {'J','a','v','a'} to a String and print it out.
        char[] javacharArray = {'J', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(javacharArray));
        //toString convert array to STRING
    }
}



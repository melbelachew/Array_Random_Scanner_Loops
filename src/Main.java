import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare array to hold 26 alphabets
        char alphabets[] = new char[26];

        alphabets = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner key = new Scanner(System.in);
        String word = "";
        String vowel = ("aeiow");
        
       
        System.out.println("Enter the length of the word");

        int userInput = key.nextInt();
        
                for(int i = 0; i<userInput; i++) {
            Random r = new Random();
            int randomAlpha = r.nextInt(alphabets.length);
          String letter = Character.toString(alphabets[randomAlpha]);
          word = word + letter;
        }
        System.out.println(word);
      // declaring a new array to convert word to array
        String wordArray[] = new String[userInput];

    }
}

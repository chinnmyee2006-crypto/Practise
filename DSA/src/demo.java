import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = sc.nextLine();

        int character = 0;
        int words = 0;
        int vowels = 0;

        String lower = sentence.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch != ' ') {
                character++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;


            System.out.println("word:" + words);
            System.out.println("vowels:" + vowels);
            System.out.println("character:" + character);
            System.out.println("sentence:" + sentence);
            System.out.println("sentence:" + lower);
            sc.close();
        }
    }
}


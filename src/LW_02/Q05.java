package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

    public class Q05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            String cleanSentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");

            StringTokenizer tokenizer = new StringTokenizer(cleanSentence);


            StringBuilder sb = new StringBuilder();
            while (tokenizer.hasMoreTokens()) {
                String word = tokenizer.nextToken().toLowerCase();
                sb.append(word);
            }


            String processed = sb.toString();


            String reversed = sb.reverse().toString();


            if (processed.equals(reversed)) {
                System.out.println("The sentence IS a palindrome.");
            } else {
                System.out.println("The sentence is NOT a palindrome.");
            }

            scanner.close();
        }
    }


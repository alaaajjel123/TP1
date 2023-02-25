package Problems;

import java.util.Scanner;

public class Reversed_Words {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a text: ");
	        String inputText = scanner.nextLine();
	        String outputText = reverseWords(inputText);
	        System.out.println("Reversed text: " + outputText);
	    }

	    public static String reverseWords(String inputText) {
	        String[] words = inputText.split(" ");
	        StringBuilder outputTextBuilder = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWordBuilder = new StringBuilder(word);
	            reversedWordBuilder.reverse();
	            outputTextBuilder.append(reversedWordBuilder).append(" ");
	        }

	        return outputTextBuilder.toString().trim();
	    }
	}



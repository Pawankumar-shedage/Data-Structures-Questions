package excelr_assignments;

import java.util.Scanner;

//2) Design a Java program that performs various string operations and uses control statements for user input validation. The program should allow the user to perform the following operations:
//
//Concatenate Strings: The user can enter two strings and the program should concatenate them.
//Find Length of a String: The user can enter a string, and the program should display its length.
//Convert to Upper case and Lower case: The user can enter a string, and the program should display it in both uppercase and lowercase.
//Extract Substring: The user can enter a string and specify the starting and ending index, and the program should extract and display the substring.
//Split a Sentence: The user can enter a sentence, and the program should split it into words and display them.
//Reverse a String: The user can enter a string, and the program should reverse and display it.
//Requirements:
//Use control statements (if-else, switch, loops) for input validation and handling possible errors.
//Implement a user-friendly console interface for the user to interact with the program.
//Cover all string concepts, such as concatenation, length, uppercase and lowercase conversion, substring extraction, splitting, and reversal.


public class Java_Assg2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("String Operations Menu:");
            System.out.println("1. Concatenate Strings");
            System.out.println("2. Find Length of a String");
            System.out.println("3. Convert to Uppercase and Lowercase");
            System.out.println("4. Extract Substring");
            System.out.println("5. Split a Sentence");
            System.out.println("6. Reverse a String");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    String concatenatedString = str1.concat(str2);
                    System.out.println("Concatenated string: " + concatenatedString);
                }
                case 2 -> {
                    System.out.print("Enter a string: ");
                    String lengthString = scanner.nextLine();
                    int length = lengthString.length();
                    System.out.println("Length of the string: " + length);
                }
                case 3 -> {
                    System.out.print("Enter a string: ");
                    String caseString = scanner.nextLine();
                    String uppercase = caseString.toUpperCase();
                    String lowercase = caseString.toLowerCase();
                    System.out.println("Uppercase: " + uppercase);
                    System.out.println("Lowercase: " + lowercase);
                }
                case 4 -> {
                    System.out.print("Enter a string: ");
                    String substringString = scanner.nextLine();
                    System.out.print("Enter the starting index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the ending index: ");
                    int endIndex = scanner.nextInt();
                    String substring = substringString.substring(startIndex, endIndex);
                    System.out.println("Substring: " + substring);
                    scanner.nextLine(); // Consume newline character
                }
                case 5 -> {
                    System.out.print("Enter a sentence: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.split(" ");
                    System.out.println("Words in the sentence:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                }
                case 6 -> {
                    System.out.print("Enter a string: ");
                    String reverseString = scanner.nextLine();
                    StringBuilder reversed = new StringBuilder(reverseString);
                    reversed.reverse();
                    System.out.println("Reversed string: " + reversed);
                }
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}

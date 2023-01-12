import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static String[] receiveWordsArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many words do you want to enter : ");
        int total = scanner.nextInt();

        scanner.nextLine();

        String[] wordArr = new String[total];
        for (int i = 0; i < wordArr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". word: ");
            wordArr[i] = scanner.nextLine();
        }
        return wordArr;
    }

    static void checkArray(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome word. ");
            } else {
                System.out.println(word + " is not a palindrome word. ");
            }
        }
    }

    static boolean isPalindrome(String word) {
        String storage = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            storage += word.charAt(i);
        }
        return word.equals(storage);
    }

    public static void main(String[] args) {
        String[] words = receiveWordsArr();
        System.out.println("\n" + "Your words:" + Arrays.toString(words) + "\n");
        checkArray(words);
    }
}
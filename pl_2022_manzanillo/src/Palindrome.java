import java.util.Scanner;
public class Palindrome {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a word: ");
            String input = sc.nextLine();

            if (isPalindrome(input))
                System.out.println(input + " is a palindrome");
            else
                System.out.println(input + " is NOT a palindrome");
        }

        public static boolean isPalindrome(String str){
            String original = str.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s","");
            StringBuilder reversed = new StringBuilder();

            for (int c = original.length()-1; c >= 0; c--)
                reversed.append(original.charAt(c));

            return (original.equalsIgnoreCase(reversed.toString()));
        }
    }


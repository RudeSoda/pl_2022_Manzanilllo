import java.util.Scanner;

public class Activity_4_Parser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tokens: ");
        String[] tokens = sc.nextLine().split("\\s+");
        if (isValidSyntax(tokens)) {
            System.out.println("Syntax is Correct!");
        } else {
            System.out.println("Syntax Error!");
        }
        sc.close();
    }

    public static boolean isValidSyntax(String[] tokens) {
        String[] correctSyntax1 = {"<data_type>", "<identifier>", "<assignment_operator>", "<value>", "<delimiter>"};
        String[] correctSyntax2 = {"<data_type>", "<identifier>", "<delimiter>"};
        return tokens.length == correctSyntax1.length && tokensAreEqual(tokens, correctSyntax1)
                || tokens.length == correctSyntax2.length && tokensAreEqual(tokens, correctSyntax2);
    }

    public static boolean tokensAreEqual(String[] tokens1, String[] tokens2) {
        for (int i = 0; i < tokens1.length; i++) {
            if (!tokens1[i].equals(tokens2[i])) {
                return false;
            }
        }
        return true;
    }
}
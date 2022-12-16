import java.util.Scanner;

public class Activity_3_Tokenizer {

    public static void main(String[] args) {
        method();
    }
    public static void printer(String s) {
        System.out.print(s);
    }

    public static void method() {
        Scanner sc = new Scanner(System.in);
        printer("Enter Source Language: ");
        String i = sc.nextLine();
        printer("Output is: ");

        String[] input = i.split(" ");
        String[] choices = { "String", "int", "char", "double" };
        String CONSTANT = "<data_type>";
        String[] array = new String[input.length];


        for (int x = 0; x < input.length; x++) {
            String string = input[x];

            if (isDataType(string, choices)) {
                array[x] = CONSTANT;
            } else if (string.contains("=")) {
                array[x] = "<assignment_operator>";
            } else if (string.contains(";")) {
                array[x] = "<delimiter>";
            } else if (string.contains("\"") || string.contains("'")) {
                array[x] = "<value>";
            } else {
                array[x] = "<identifier>";
            }
        }
        sc.close();
        for (String string : array) {
            printer(string);
        }
    }

    public static boolean isDataType(String string, String[] choices) {
        for (String choice : choices) {
            if (string.contains(choice)) {
                return true;
            }
        }
        return false;
    }
}
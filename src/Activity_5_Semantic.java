import java.util.Scanner;

public class Activity_5_Semantic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] dataTypes = { "String", "int", "double", "char", "boolean" };

        boolean isValid = false;
        for (String dataType : dataTypes) {
            if (input.contains(dataType)) {
                if (dataType.equals("String") && input.contains("=") && input.contains("\"") && input.contains(";")) {
                    isValid = true;
                } else if (dataType.equals("int") && input.contains("=") && input.contains(";") &&
                        isValidNumber(input, 3)) {
                    isValid = true;
                } else if (dataType.equals("double") && input.contains("=") && input.contains(";") &&
                        input.contains(".") && isValidNumber(input, 3)) {
                    isValid = true;
                } else if (dataType.equals("char") && input.contains("=") && input.contains("\'") && input.contains(";")) {
                    isValid = true;
                } else if (dataType.equals("boolean") && input.contains("=") && input.contains(";") &&
                        (input.contains("true") || input.contains("false"))) {
                    isValid = true;
                }
            }
        }

        if (isValid) {
            System.out.println("Semantically Correct!");
        } else {
            System.out.println("Semantically Incorrect!");
        }
    }

    private static boolean isValidNumber(String input, int index) {
        try {
            String value = input.split(" ")[index];
            if (value.contains(".")) {
                Double.parseDouble(value);
            } else {
                Integer.parseInt(value);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
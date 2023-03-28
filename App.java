import java.util.Scanner;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String yesNo = "yes";

        while (true) {
            if ((yesNo.toLowerCase()).equals("yes") || (yesNo.toLowerCase()).equals("y")) {

                String prompt = "Please enter the mathematical equation that you would like to perform: \n(A)ddition\n(S)ubtraction\n(M)ultiplication\n(D)ivision";
                String selection = getString(prompt);

                prompt = "Please enter a number:";
                double num1 = getDouble(prompt);
                prompt = "Please enter a second number:";
                double num2 = getDouble(prompt);
                Calculator calc = new Calculator();
                double result = 0;
                String output = "";

                if ((selection.toLowerCase()).equals("addition") || (selection.toLowerCase()).equals("a")) {
                    result = calc.add(num1, num2);
                    output = String.format("The result of the addition of %.2f and %.2f is %.2f", num1, num2,
                            result);
                    System.out.println(output);
                } else if ((selection.toLowerCase()).equals("subtraction") || (selection.toLowerCase()).equals("s")) {
                    result = calc.subtract(num1, num2);
                    output = String.format("The result of the subtraction of %.2f and %.2f is %.2f", num1, num2,
                            result);
                    System.out.println(output);
                } else if ((selection.toLowerCase()).equals("multiplication")
                        || (selection.toLowerCase()).equals("m")) {
                    result = calc.multiply(num1, num2);
                    output = String.format("The result of the multiplication of %.2f and %.2f is %.2f", num1, num2,
                            result);
                    System.out.println(output);
                } else if ((selection.toLowerCase()).equals("division") || (selection.toLowerCase()).equals("d")) {
                    if (num2 == 0) {
                        System.out.println("The denominator cannot be zero ");
                    } else {
                        result = calc.divide(num1, num2);
                        output = String.format("The result of the division of %.2f and %.2f is %.2f", num1, num2,
                                result);
                        System.out.println(output);
                    }
                }
                prompt = "Would you like to perform additional calculations? Type yes or no";
                yesNo = getString(prompt);
            } else {
                System.out.println("Goodbye");
                break;
            }
        }

    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringInput = inputScanner.next();
        return stringInput;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double doubleInput = inputScanner.nextDouble();
        return doubleInput;
    }

}

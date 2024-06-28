package AssignmentChapter7All;

public class Calculator {
    public static void main(String[] args) {
        // Check the number of command-line arguments
        if (args.length != 3) {
            System.out.println("Usage: java BinaryCalculator operator operand1 operand2");
            System.exit(1);
        }

        // Retrieve the operator and operands from command-line arguments
        String operator = args[0];
        int operand1 = Integer.parseInt(args[1]);
        int operand2 = Integer.parseInt(args[2]);

        // Perform the binary operation based on the operator
        int result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator: " + operator);
                System.exit(1);
        }

        // Display the result
        System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
    }
}
package bt10;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
//    public static void main(String[] args) {
//        String regex = new Scanner(System.in).nextLine();
//        Stack<Integer> myStack = new Stack<>();
//        String[] myList = regex.split("");
//
//        String toanTu;
//        for (int i = 0; i < myList.length; i++) {
//            if (myList[i].equals("+") || myList[i].equals("-") || myList[i].equals("/") || myList[i].equals("*")) {
//                toanTu = myList[i];
//                if (myStack.size() >= 2) {
//                    int num1 = myStack.pop();
//                    int num2 = myStack.pop();
//                    System.out.println(num1 + " " + num2);
//                    if (toanTu.equals("+")) {
//                        myStack.push(num2 + num1);
//                    }
//                    if (toanTu.equals("-")) {
//                        myStack.push(num2 - num1);
//                    }
//                    if (toanTu.equals("/")) {
//                        myStack.push(num2 / num1);
//                    }
//                    if (toanTu.equals("*")) {
//                        myStack.push(num2 * num1);
//                    }
//                } else {
//                    continue;
//                }
//            }
//            myStack.push(Integer.parseInt(myList[i]));
//        }
//
//
//        System.out.println("Kết quả là: " + myStack.pop());
//    }
public static double calculate(String expression) {
    Stack<Double> stack = new Stack<>();

    String[] tokens = expression.split(" ");

    for (String token : tokens) {
        if (isNumeric(token)) {
            stack.push(Double.parseDouble(token));
        } else if (isOperator(token)) {
            if (stack.size() < 2) {
                System.out.println("Invalid expression");
                return Double.NaN;
            }
            double operand2 = stack.pop();
            double operand1 = stack.pop();
            double result = performOperation(operand1, operand2, token);
            stack.push(result);
        } else {
            System.out.println("Invalid token: " + token);
            return Double.NaN;
        }
    }

    if (stack.size() == 1) {
        return stack.pop();
    } else {
        System.out.println("Invalid expression");
        return Double.NaN;
    }
}

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
//        String expression = "5 3 + 4 *";
        String expression = new Scanner(System.in).nextLine();
        double result = calculate(expression);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}

package bt14;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        Stack<Integer> listChar = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (checkIntiger(str.charAt(i))) {
                int result = Integer.parseInt(String.valueOf(str.charAt(i)));
                if (checkSNT(result)) {
                    listChar.push(result);
                }
            }
        }

        if (listChar.size() == 0) {
            System.err.println("Không có số nào là số nguyên tố");
        } else {
            System.out.println(listChar);
        }

    }

    public static boolean checkIntiger(char s) {
        try {
            int number = Integer.parseInt(String.valueOf(s));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkSNT(int n) {
        if (n <= 1) {
            return false;
        }
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}

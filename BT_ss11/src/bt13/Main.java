package bt13;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String[] arr = str.split("");
        Stack<String> myStr = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (myStr.size() == 0) {
                myStr.push(arr[i]);
            } else {
                if (arr[i] != " " && myStr.peek().compareTo(arr[i]) > 0) {
                    myStr.push(arr[i]);
                }
            }
        }
        System.out.println(myStr);
    }
}

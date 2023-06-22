package bt04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập vào số lượng các từ bạn muốn nhập: ");
        int n = new Scanner(System.in).nextInt();
        Stack<String> list = new Stack<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập từ thứ %d: ", i + 1);
            String str = new Scanner(System.in).next();
            list.push(str);
        }
        while (!list.isEmpty()) {
            System.out.print(list.pop() + " ");
        }
    }
}

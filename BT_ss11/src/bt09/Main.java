package bt09;

import java.util.ArrayList;
import java.util.Stack;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>(asList(1, 2, 3, 4, 5, 6));
        Stack<Integer> stack = new Stack<>();
        System.out.println(listNumber);
        for (int i = 0; i < listNumber.size(); i++) {
            stack.push(listNumber.get(i));
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

package bt05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "Able was I ere I saw elbA";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }
        Queue<Character> queue = new LinkedList<>(stack);
        while (!stack.isEmpty()) {
            if (!(stack.pop() == queue.poll())) {
                System.out.println("không phải chuỗi Palindrome ");
                return;
            }
        }
        System.out.println(str + " là 1 chuỗi Palindrome ");
    }
}

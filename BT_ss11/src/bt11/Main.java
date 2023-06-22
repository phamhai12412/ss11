package bt11;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> listNumber = new Stack<>();

        listNumber.add(2);
        listNumber.add(5);
        listNumber.add(1);
        listNumber.add(9);
        listNumber.add(7);
        listNumber.add(200);

        for (int i = 0; i < listNumber.size(); i++) {
            if (listNumber.get(i) > listNumber.peek()) {
                listNumber.push(listNumber.get(i));
            }
        }

        System.out.println("Max: " + listNumber.pop());
    }
}

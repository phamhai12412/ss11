package bt01;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> listNum = new ArrayDeque<>();
        listNum.offer(1);
        listNum.offer(3);
        listNum.offer(5);
        listNum.offer(8);

        while (!listNum.isEmpty()) {
            System.out.print(listNum.poll() + " ");
        }
    }
}

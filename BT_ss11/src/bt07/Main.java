package bt07;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Bình", true, "18/09/2001"));
        list.add(new Student(2, "Hải", true, "18/09/1992"));
        list.add(new Student(3, "Huy", true, "18/09/1998"));
        list.add(new Student(4, "Huền", true, "18/09/2001"));
        list.add(new Student(5, "Yến", true, "18/09/2001"));
        list.add(new Student(6, "Vi", true, "18/09/2001"));

        for (Student s : list) {
            System.out.println(s);
        }
        list.sort(Comparator.comparing(Student::getDob));

        Queue<Student> queueMale = new ArrayDeque<>();
        Queue<Student> queueFeMale = new ArrayDeque<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isGender()) {
                queueMale.offer(list.get(i));
            } else {
                queueFeMale.offer(list.get(i));
            }
        }

        System.out.println("Danh sách học sinh nũ: " + queueFeMale);
        System.out.println("Danh sách học sinh nam: " + queueMale);
    }
}

package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void question01() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ân"));
        students.add(new Student("Quân"));
        students.add(new Student("Ngân"));
        students.add(new Student("Ly"));
        students.add(new Student("Ân"));
        students.add(new Student("Vũ"));

        // a) In ra tổng số phần tử của students
        System.out.println(students.size());

        // b) Lấy phần tử thứ 4 của students
        System.out.println(students.get(3));

        // c) In ra phần tử đầu vào vị trí đầu của students


        // d) Thêm 1 phần tử vào vị trí đầu của students
        students.add(0, new Student("Na"));

        // e) Thêm 1 phần tử vào vị trí cuối của students
        students.add(new Student("Đường"));

        // f) Đảo ngược vị trí của students
        for (int i = 0; i <= students.size() / 2; i++) {
            Student s1 = students.get(i);
            Student s2 = students.get(students.size() - 1 - i);
            students.set(i, s2);
            students.set(students.size() - 1 - i, s1);
        }
        System.out.println(students);
//        Collections.reverse(students);
    }

    // g) Tìm học sinh theo id
    public static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // i) Tìm học sinh có tên trùng nhau
    public static void showStudentSameName(List<Student> students) {
        List<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();
        for (Student student : students) {
            String name = student.getName();
            if (l1.contains(name)){
                if (!l2.contains(name)) {
                    l2.add(name);
                }
            } else {
                l1.add(name);
            }
        }
        System.out.println(l2);
    }

    // j) Xóa name của student có id = 2

}

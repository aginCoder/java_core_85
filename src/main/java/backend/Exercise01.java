package backend;

import entity.PrimarySchool;
import entity.SecondarySchool;
import entity.Student;

public class Exercise01 {
    public static void question01() {
        Student s1 = new Student( "Phạm Gia Ân");
        Student s2 = new Student( "Thái Hoàng Quân");
        Student s3 = new Student( "Đỗ Văn Vũ");
        Student[] students = {s1, s2, s3};

        Student.college = "Đại học bách khoa";
//        for (Student student : students) {
//        }
        System.out.println("s1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);

        Student.college = "Đại học công nghệ";
        System.out.println("\ns1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);
    }

    public static void question02() {
        Student s1 = new Student( "Phạm Gia Ân");
        Student s2 = new Student( "Thái Hoàng Quân");
        Student s3 = new Student( "Đỗ Văn Vũ");

        s1.moneyGroup += 100;
        s2.moneyGroup += 100;
        s3.moneyGroup += 100;
        System.out.println("Qũy lớp:  " + Student.moneyGroup);

        s1.moneyGroup -= 50;
        System.out.println("Qũy lớp còn lại: " + Student.moneyGroup);

        s2.moneyGroup -= 20;
        System.out.println("Qũy lớp còn lại: " + Student.moneyGroup);

        s3.moneyGroup -= 150;
        System.out.println("Qũy lớp còn lại: " + Student.moneyGroup);

        s1.moneyGroup += 50;
        s2.moneyGroup += 50;
        s3.moneyGroup += 50;
        System.out.println("Qũy lớp:  " + Student.moneyGroup);
    }

    public static void question05() {
        Student s1 = new Student( "Phạm Gia Ân");
        Student s2 = new Student( "Thái Hoàng Quân");
        Student s3 = new Student( "Đỗ Văn Vũ");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Số lượng sinh viên: " + Student.count);
    }

    public static void question06() {
        Student s1  = new PrimarySchool("A");
        Student s2  = new PrimarySchool("B");
        Student s3  = new SecondarySchool("C");
        Student s4  = new SecondarySchool("D");
        Student s5  = new SecondarySchool("E");
        Student s6  = new SecondarySchool("F");
        System.out.println("Số lượng student = " + Student.count);
        System.out.println("Số lượng Primary student = " + PrimarySchool.count);
        System.out.println("Số lượng Secondary student = " + SecondarySchool.count);
    }
}

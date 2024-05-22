public class StaticDemo {
    public static void main(String[] args) {
        // static: thuộc về class
        Student s1 = new Student("Ân", 19);
        Student s2 = new Student("Quân", 20);
        s1.count = 10;
        System.out.println("s2.count = " + s2.count);

        // Truy cập thông qua tên của class
        System.out.println("Student.count = " + Student.count);
        int max = Student.max(10, 100);
        System.out.println("max = " + max);

        // Static không thể truy cập non-static
        // Non-sttaic có thể truy cập static
    }
}

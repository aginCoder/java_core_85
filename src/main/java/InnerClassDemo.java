public class InnerClassDemo {
    public static void main(String[] args) {
        //Inner class: Class trong class
        Student student = new Student(1, "Ân");
        Student.Gender gender = student.new Gender("Male");
        gender.showInfo();
        // Inner classcosos thể truy cập private của lớp ngoài (chứa nó)
        gender.showPrivateOuterClass();

        // Class trong method
        demoClassInMethod();
    }

    public static void demoClassInMethod() {
        class Dog {
            private String color;
            private String name;

            public Dog(String color, String name) {
                this.name = name;
                this.color = color;
            }

            @Override
            public String toString() {
                return "Dog{" +
                        "color='" + color + '\'' +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        Dog dog = new Dog("Shiba", "Orange");
        System.out.println(dog);
    }
}

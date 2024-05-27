package entity;

import java.util.SplittableRandom;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student that = (Student) obj;
        return this.id == that.id
                && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package entity;

public class PrimarySchool extends Student{
    public static int count;

    public PrimarySchool(String name) {
        super(name);
        count++;
    }
}

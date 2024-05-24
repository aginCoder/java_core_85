package entity;

public class SecondarySchool extends Student{
    public static int count;

    public SecondarySchool(String name) {
        super(name);
        count++;
    }
}

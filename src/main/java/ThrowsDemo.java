import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        var stream = new IOStream();
        try {
            stream.write();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

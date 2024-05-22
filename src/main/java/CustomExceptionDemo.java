public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            var age = 15;
            if (age >= 18) {
                System.out.println("Bạn đã đủ 18 tuổi");
            } else {
                throw new IllegalStateException("Bạn chưa đủ 18 tuổi");
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

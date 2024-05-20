public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            var calculator = new Calculator();
            var result = calculator.divide(1, 1);
            System.out.println("result = " + result);
            
            String s = null;
            int length = s.length();
            System.out.println("length = " + length);

//            Integer.parseInt("abc");
        } catch (ArithmeticException exception) {
            System.out.println(" result = vô cùng");
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Khối finally luôn đc gọi");
        }
    }
}

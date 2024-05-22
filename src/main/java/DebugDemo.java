public class DebugDemo {
    public static void main(String[] args) {
        hole();
        int[] numbers = {5, 6, 7, 2, 9, 10, 15};
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("max = " + max);
    }

    public static void hole() {
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
        System.out.println("Line code");
    }
}

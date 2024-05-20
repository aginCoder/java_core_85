public class OverLoadingDemo {
    public static void main(String[] args) {
        MyMath math =  new MyMath();
//        int[] array = {1,1,1,1,1};
        int total = math.sum(1,2,3,4,5,6,7);
        System.out.println("total = " + total);
    }
}

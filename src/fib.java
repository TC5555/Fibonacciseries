public class fib {
    public static void main(String[] args) {
        int i = 1;
        int e = 1;
        for (int j  = 1; j <= 6; j++) {
            System.out.print(e + " ");
            e = i + e;
            System.out.print(i + " ");
            i = i + e;
        }
    }
}

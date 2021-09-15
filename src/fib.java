public class fib {
    public static void main(String[] args) {
        for (int k = 0; k < 6; k++) {
            int i = 1;
            int e = 1;
            for (int j  = 1; j <= k; j++) {
                i = i + e;
                e = i + e;
            }
            System.out.print(i + " " + e + " ");
        }
    }
}

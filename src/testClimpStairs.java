public class testClimpStairs {
    public static void main(String[] args) {
        int n = 2;
        int p = 0, q = 0, r = 1;
        for (int i = 0; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        System.out.print(r);
    }
}

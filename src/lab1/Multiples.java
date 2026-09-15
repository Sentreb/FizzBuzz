package lab1;

public class Multiples {
    public static void main(String[] args) {
        int cnt = multiples(1000, 3, 5);
        System.out.println(cnt);
    }

    public static int multiples(int n, int a, int b) {
        int cnt = 0;
        for (int i = 1; i < n; i += 1) {
            if (i % a == 0 | i % b == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }
}

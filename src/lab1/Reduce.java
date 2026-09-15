package lab1;

public class Reduce {
    public static void main(String[] args) {
        int cnt = reduce(100);
        System.out.println(cnt);
    }

    public static int reduce(int n) {
        int cnt = 0;
        int i = n;
        while (i > 0){
            if (i % 2 == 0){
                i /= 2;
            }
            else{
                i -= 1;
            }
            cnt += 1;
        }
        return cnt;
    }
}

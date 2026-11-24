package Array;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fn = 0;
        int sn = 1;
        for (int i = 1; i <= n; i++){
            int next = fn + sn;
            System.out.print(next+" ");
            fn = sn;
            sn = next;
        }
    }
}

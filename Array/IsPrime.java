package Array;
import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n) {
        int count = 0;
        if (n == 1 || n == 2) {
            return true;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

}

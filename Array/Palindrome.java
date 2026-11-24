package Array;
import java.util.Scanner;

public class Palindrome {
    public static boolean  Pal (int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        return rev == original;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Pal(num));

    }
}

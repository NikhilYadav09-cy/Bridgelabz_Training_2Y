package Array;

import java.util.Scanner;

public class SumOfDigits {
    public static int Pal (int n){
        int original = n;
        int rev = 0;
        while(n!=0){
            int digit=n%10;
            rev=rev+digit;
            n=n/10;

        }return rev;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Pal(n));
    }
}


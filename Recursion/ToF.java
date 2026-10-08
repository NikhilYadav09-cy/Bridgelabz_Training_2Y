package Recursion;

import java.util.Scanner;

public class ToF {
    public static int muti(int a, int b) {
        return (a * b);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = add(a, b);
        int m = sub(a, b);
        System.out.println(m);
        System.out.println(res);
    }
}

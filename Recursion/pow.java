package Recursion;
import java.util.Scanner;

public class pow {
    public static int fact(int n, int p){
        if(p==0) {
            return 1;
        }
        int num = fact(n,p-1);
        return n*num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fact(5,4));
    }
}


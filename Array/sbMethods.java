package Array;

import java.util.Scanner;

public class sbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        sb = new StringBuilder(s);
        sb.append("India");
        System.out.println(sb.toString());
        sb.reverse();
        sb.insert(6,'l');
        System.out.println(sb.toString());


    }
}

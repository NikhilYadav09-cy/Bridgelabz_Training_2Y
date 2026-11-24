package Array;
import java.util.Scanner;

public class Calculator {
    public static  int sub(int a, int b){
        return a - b;
    }
    public static int add (int a, int b){
        return a+b;
    }
    public static int  mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Select operator '+','-','/','*' ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        if (operator == '+'){
            System.out.println("result = "+add(a,b));
        }
        else if (operator == '-'){
            System.out.println("result = "+sub(a,b));
        }
        else if (operator == '/'){
            System.out.println("result = "+div(a,b));
        }
        else if (operator == '*'){
            System.out.println("result = "+mul(a,b));
        }
        else{
            System.out.println("Invalid operator");
        }

    }

}

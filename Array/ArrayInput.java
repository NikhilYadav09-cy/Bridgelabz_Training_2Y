package Array;
import java.util.Scanner;
public class ArrayInput {
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void inp(int[]arr){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void reverse(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        display(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n=sc.nextInt();
        int[] arr = new int[n];
        inp(arr);
        display(arr);
        System.out.println(" ");
        reverse(arr,a,b);
    }
}

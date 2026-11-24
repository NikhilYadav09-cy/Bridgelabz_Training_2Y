package Recursion;

import java.util.Scanner;

public class maxElement {
    public static int max(int n,int [] arr){
        if(n==arr.length-1){
            return arr[n];
    }
        int res=max(n+1,arr);
        return Math.max(res,max(n+1,arr));
   }
   public static void main (String[] args) {
       int [] arr = {1,2,3,4,5,6,7};
       System.out.println(max(0,arr));
   }
}

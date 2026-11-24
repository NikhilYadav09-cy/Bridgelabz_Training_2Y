package Recursion;

public class BinSearch {
    public static int scr(int n,int [] arr,int target){
        if(n==arr.length){
            return -1;
        }
        if(arr[n]==target){
            return n;
        }
        return scr(n+1,arr,target);
    }
    public static void main(String[] args) {
        int [] arr= {2,3,4,5,68,0,1,5};
        System.out.println(scr(0,arr,4));
    }
}

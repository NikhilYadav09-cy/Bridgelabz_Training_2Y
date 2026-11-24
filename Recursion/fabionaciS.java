package Recursion;

public class fabionaciS {
    public static int Fs(int n){
        if(n==0||n==1){
            return n;
        }
        int s1=Fs(n-1);
        int s2=Fs(n-2);
        return s1+s2;
    }
    public static void main(String[]args){
        int n = 10;
        System.out.println(Fs(5));

    }
}

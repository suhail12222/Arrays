package algorithmsandproblems;
//WAJP to store n terms of Fibonacci series into
//an array.

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []b=storeNFibonacciNumbers(n);
        for (int L:b){
            System.out.print(L+" ");
        }

    }
    public static int []storeNFibonacciNumbers(int n){
        int []a=new int [n];
        if (n==0)return a;
        a[0]=0;
        if ( n==1)return a;
        a[1]=1;
        for (int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];

        }
        return a;
    }
}
//    public int fib(int n) {
//
//int a=0;
//        int b=1;
//        int count =1;
//       if(n<1){return 0;}
//    else if(n==1){return 1;}
//    else{
//        while(count<n){
//            int next=a+b;
//            a=b;
//            b=next;
//            count++;
//        }
//        return b;}
//
//
//
//
//
//    }
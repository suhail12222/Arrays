package algorithmsandproblems;

import java.util.Scanner;

//WAJP to count all prime numbers up to n.
public class Program16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=countAllPrimeNumbersInAnArray(n);
        System.out.println(count);
//        int []b=storeFirstNPrimeNumbers(n);
//        for (int o:b){
//            System.out.print(o+" ");
//        }
    }



    public static int countAllPrimeNumbersInAnArray(int n){
        int count=0;
        for (int i=2;i<=n;i++){
            if (isPrime(i))count++;
        }
      return  count;
    }
//    public static int [] storeFirstNPrimeNumbers(int n){
//        int []a=new int [n];
//        int count =0;
//        int num=2;
//        while(count<n){
//            if (isPrime(num)){
//                a[count++]=num;
//            }
//            num++;
//        }
//        return a;
//    }



    public static boolean isPrime(int n){
        if (n<=1)return false;
        if (n==2)return true;
        if (n%2==0)return false;
        for (int i=3;i*i<=n;i+=2){
            if (n%i==0)return false;
        }
        return true;

    }
}

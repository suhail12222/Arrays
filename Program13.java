package algorithmsandproblems;
import java.util.Scanner;
//WAJP to store first n prime numbers into array.
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []b=storeFirstNPrimeNumbers(n);
       for (int o:b){
           System.out.print(o+" ");
       }


    }
    public  static int [] storeFirstNPrimeNumbers(int n){
        int []a=new int [n];
        int count =0;
        int num2=2;
        while(count<n){
            if (isPrime(num2)){
                a[count]=num2;
                count++;


            }
            num2++;
        }
        return a;
    }

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

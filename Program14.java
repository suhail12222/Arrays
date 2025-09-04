package algorithmsandproblems;

import java.util.Scanner;

//WAJP to store first n palindrome numbers into
//array.
public class Program14 {
    public static void main(String[] args){
        Scanner  scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []b=storeFirstNPalindromeNumbers(n);
        for (int o:b){
            System.out.print(o+" ");
        }
    }


    public static int [] storeFirstNPalindromeNumbers(int n){
        int []a=new int [n];
        int count=0;
        int num=1;
        while(count<n){
            if (isPlaindrome(num)){
                a[count]=num;
                count++;
            }
            num++;
        }
        return a;
    }
    public static boolean isPlaindrome(int n){
        int nums=n;
        int rev=0;
        while (n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return nums==rev;
    }
}

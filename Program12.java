package algorithmsandproblems;
//WAJP to print and count all the palindrome
//number elements from array.
public class Program12 {
    public static void main(String[] args){
     int []a={131,121,132,123,454,787,989,1001,12321,1234321};
     printAndCountPalindromeNumbersInAnArray(a);
    }
    public static void printAndCountPalindromeNumbersInAnArray(int []a){
        int count=0;
        for (int o:a){
            if (isPalindrome(o)){
                count++;
                System.out.println("palindrome number in an array are "+o);
            }
        }
        System.out.println("total number of palidrome numbers in an array is "+ count);
    }
    public static boolean isPalindrome(int n){
        int nums=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev==nums;

    }

}

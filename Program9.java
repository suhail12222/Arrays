package algorithmsandproblems;
//WAJP to print and count all the prime number
//elements from array.
public class Program9 {
    public static void main(String[]args){
        int []a={2,3,5,7,9,10,12,13,14,15,16,17,18,19,20};
        printAndCountPrimeNumbersInAnArray(a);
    }
    public static void printAndCountPrimeNumbersInAnArray(int []a){
int count=0;
for (int o:a){
    if (isPrime(o)){
        System.out.println(o);
        count++;
    }

}
        System.out.println("total no of Prime numbers in an array are"+count);
    }


    public static boolean isPrime(int n){
        if (n<=1)return false;
        if (n==2)return true;
        if (n%2==0)return false;
        for (int i=3;i*i<=n;i+=2){
            if (n%i==0)return false;
        }
        return  true;
    }
}

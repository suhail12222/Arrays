package algorithmsandproblems;
//WAJP to get sum of all the prime number
//elements from array.
public class Program11 {
    public static void main(String[] args){
        int []a={2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,19};
        System.out.println("sum of the prime number in an array is "+sumOfAllPrimeNumberInAnArray(a));
    }
    public static int sumOfAllPrimeNumberInAnArray(int []a){
        int sum=0;
        for (int o:a){
            if (isPrime(o)){
                sum+=o;
            }

        }
        return sum;
    }




    //to find the prin=me number in an array
    public static boolean isPrime(int a){
        if (a<=1)return false;
        if (a==2)return true;
        if (a%2==0)return false;
        for (int i=3;i*i<=a;i+=2){
            if (a%i==0)return false;
        }
        return true;
    }
}

package algorithmsandproblems;
//WAJP to check array is a palindromic array or
//not. Return true or false accordingly.
//orginal array: {10,20,30,40,30,20,10}
public class Program20 {
    public static void main(String [] args){
int [] orginalArray={10,20,30,40,30,20,10,90};
boolean isPalimdromes=isPalindrome(orginalArray);
        System.out.println(isPalimdromes);
    }
    public static boolean isPalindrome(int []a){
        int n=a.length;
        for (int i=0;i<n/2;i++){
            if (a[i]!=a[n-i-1]){
                return false;
            }

        }
        return true;
    }
}

package algorithmsandproblems;
//WAJP find missing element from a given array
//which has a missing element in a range of n.
//
//N=7
//
//i/p: [7, 4,3, 0, 5, 1, 6]
//======Program no 51========\\

//==============================================================================\\
//“The sum of numbers from 1 to the maximum number N is always N*(N+1)/2.
// If one number is missing, just subtract the sum of the array from this total.”
public class Program6 {
    public static void main(String[] args) {
int [] input={7,3,2,5,1,6};
int result=findMissingNumber(input);
        System.out.println(result);
}

    public static int  findMissingNumber(int []a) {
//        find maximum number
        int max=a[0];
        for (int num:a){
            if (max<num){
                max=num;
            }
        }
        int n = a.length;
        // we use the property of sum  and the difference between expected sum and actual sum is the difference.
    int expexctedSum=max*(max+1)/2;
    int actualSum=0;
    for (int num:a){
        actualSum+=num;
    }
    int missing=expexctedSum-actualSum;
    return missing;
    }

}

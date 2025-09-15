package algorithmsandproblems;
//WAJP to print Biggest and second biggest
//element of the array.
//
//int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
//
//o/p
//
//80
//
//63
public class Program27 {
    public static void main(String[]args){
        int []orginal={80,80,43,50,38,63,58,80};
        biggestAndSecondBiggestElementOfArray(orginal);
    }
    public static void biggestAndSecondBiggestElementOfArray(int []a){
        int n=a.length;
        int bigget=a[0];
        int secondBiigest=Integer.MIN_VALUE;

        for (int nums:a){
        if (nums>bigget){
            secondBiigest=bigget;
            bigget=nums;

        } else if (nums>secondBiigest&&nums<bigget) {
            secondBiigest=nums;

        }
        }
        System.out.println(bigget);
        System.out.println(secondBiigest);
    }
}

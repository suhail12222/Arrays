package algorithmsandproblems;
//Print biggest element , smallest elements and
//their difference from the given array.
public class Program1 {
    public static void main(String[] args){
        int []a={3,1,2,0,9,10};
        printBiggestAndSmallestAndTheirDifference(a);
    }
    public static void printBiggestAndSmallestAndTheirDifference(int []a){
        //to find big
        int big=a[0];
        int n=a.length;
        //to find smallest
        int small=a[0];
        //find out difference
        for (int i=0;i<n;i++){
            //to find big
            if (a[i]>big){
                big=a[i];
            }
            //to find small
            if (a[i]<small){
                small=a[i];
            }
        }
        System.out.println(big+"  is the biggest number in an array");
        System.out.println(small+" is the smallest element in an array");
        System.out.println("difference between these two elements is "+(big-small));

    }
}

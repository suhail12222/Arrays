package algorithmsandproblems;
//WAJP to check whether a given array is in
//sorted order or not.
//
//i/p: [2, 7, 7, 8, 9]
//
//o/p: Array is sorted
public class Program8 {
    public static void main(String[] args) {
        int [] input={2,7,7,8,9};
        boolean result=isSortedOrNot(input);
        System.out.println(result);
    }
    public static boolean isSortedOrNot(int []a){
        int n=a.length;
        boolean isSorted=true;
        for (int i=0;i<n-1;i++){
            if (a[i]>a[i+1]){
                isSorted=false;

            }
        }
        return isSorted;
    }
}

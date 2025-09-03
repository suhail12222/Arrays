package algorithmsandproblems;
//WAJP to check whether a given array is in
//sorted order or not.
//
//i/p: [2, 7, 7, 8, 9]
//
//o/p: Array is sorted
public class Program7 {
    public static void main(String[] args){
        int []a={2,7,7,8,9};
        if (isSorted(a)){
            System.out.println("sorted array");
        }
        else {
            System.out.println("not sorted");
        }

    }
    public static boolean isSorted(int[]a){
        int n=a.length;
        for (int  i=0;i<n-1;i++){
           if (a[i]>a[i+1]){
               return false;
           }
        }
        return true;
    }
}

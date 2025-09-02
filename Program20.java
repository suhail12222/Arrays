package algorithmsandproblems;

import java.util.Arrays;

public class Program20 {
    public static void main(String[] args) {
int []s={5,4,3,2};
int []result=mergeSort(s);
for (int y:result){
    System.out.print(y+" ");
}
    }
//    public static int[] mergeSort(int[]a){
//        if (a.length==1)return a;
//        int n=a.length;
//        int midIndex=n/2;
//        int []left=mergeSort (Arrays.copyOfRange(a,0,midIndex));
//        int []right=mergeSort(Arrays.copyOfRange(a,midIndex,n));
//        return Program19.merge(left,right);
//    }
    public static int [] mergeSort(int []a){
        if (a.length==1)return a;

        int mid=a.length/2;
        int []left=mergeSort(Arrays.copyOfRange(a,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(a,mid
        ,a.length));
        return Program19.merge(left,right);
    }
}

package algorithmsandproblems;
//WAJP to check if an array is strictly increasing.
//
//i/p: [2, 3, 7, 8, 9]
//
//o/p: Array is strictly increasing

public class Program6 {
    public static void main(String[] args) {
int [] a={2,3,7,8,9,1};
if (isStrictlyIncreasing(a)){
    System.out.println("array iis strictly increasing");
}
else {
    System.out.println("Array is not Strictly increasing");
}
    }
    public static boolean isStrictlyIncreasing(int []a){
        //123456789
        //134567892
        for (int i=0;i<a.length-1;i++){
            if (a[i]>=a[i+1]){
                return false;
            }
        }
        return true;
    }
}

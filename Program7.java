package algorithmsandproblems;
//WAJP to check if an array is strictly increasing. i/p: [2, 3, 7, 8, 9] o/p: Array is strictly increasing i will try to
public class Program7 {
    public static void main(String[] args) {
        int []input={2,3,7,8,9};
        boolean result=strictlyIncreasing(input);
        if (result){
            System.out.println("Array is strictly increasing....!");
        }
        else if (!result){
            System.out.println("Array is not strictly increasing...!");
        }
    }
    public static boolean strictlyIncreasing(int []a){
        boolean isStrictlyIncreasing=true;
        for (int i=0;i<a.length-1;i++){
            if (a[i]>=a[i+1]){
                isStrictlyIncreasing=false;
                break;
            }
        }

        return isStrictlyIncreasing;
    }
}

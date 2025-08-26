package algorithmsandproblems;
//WAJP to print true if all the elements in the
//array are unique otherwise false.
public class Program12 {
    public static void main(String[] args) {
        int []input={1,3,2,5,2,6,4};

boolean result=containsUnique(input);
        System.out.println(result);
    }
    public static boolean containsUnique(int []a){
        BubbleSort.BubbleSort(a);
        int n=a.length;
        boolean areUnique=true;
        for (int i=0;i<n-1;i++){
            if (a[i]==a[i+1]){
                areUnique=false;
                break;
            }
        }
        return areUnique;
    }

}

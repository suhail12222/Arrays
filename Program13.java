package algorithmsandproblems;
//WAJP to print true if all the elements in the
//array are unique otherwise false.
public class Program13 {
    public static void main(String[] args) {
        int []a={4,3,2,5,1};
        System.out.println(isUnique(a));

    }
    public static boolean isUnique(int []a){
        int n=a.length;
        //easy way will be to sort first
        BubbleSort.BubbleSort(a);
        boolean isUnique=true;
        for (int i=0;i<n-1;i++){
            if (a[i]==a[i+1]){
                isUnique=false;
            }
        }
        return isUnique;
    }
}

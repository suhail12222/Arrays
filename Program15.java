package algorithmsandproblems;
//WAJP to sort the array elements in ascending
//order by implementing Bubble sort algorithm.
public class Program15 {
    public static void main(String[] args) {

int []input={9,6,8,3,2,5,7,4,1};
getArraySortedInAscendingByUsingBubbleSort(input);
for (int i:input){
    System.out.print(i+" ");
}

    }
    public static void getArraySortedInAscendingByUsingBubbleSort(int[]a){
        int n=a.length;
        for (int i=n-1;i>0;i--){
            for (int j=0;j<i;j++){
             if (a[j]>a[j+1]){
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
            }
        }
    }
}

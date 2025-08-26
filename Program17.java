package algorithmsandproblems;

public class Program17 {
    public static void main(String[] args) {
        int [] input={3,2,1,3,4,5,7,6};
        sortArrayUsingInsertionSort(input);
        for (int i:input){
            System.out.print(i+" ");
        }
    }
    public static void sortArrayUsingInsertionSort(int []a){
        int in=a.length;
        for (int i=1;i<in;i++){
            int temp=a[i];
            int j=i-1;
            while(j>-1&&temp<a[j]){
                a[j+1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
}

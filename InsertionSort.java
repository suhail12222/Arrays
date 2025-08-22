package algorithmsandproblems;

public class InsertionSort {
    public static void main(String[] args) {
        int []input={3,2,1,4,5};
        insertionSort(input);
        print(input);
    }
    public static void insertionSort(int[]a){
        int n=a.length;
        for (int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    public static void print(int []print){
        for (int y:print){
            System.out.print(y+" ");
        }
    }
}

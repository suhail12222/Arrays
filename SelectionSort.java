package algorithmsandproblems;

public class SelectionSort {
    public static void main(String[] args) {
        int []s={4,3,2,9,1,7,5,6,8};
        selectionSort(s);
        for (int y:s){
            System.out.print(y+" ");
        }
    }
    public static void selectionSort(int[]a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (a[j]<a[min]){
                    min=j;

                }
            }
            if(i!=min) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }

    }
}

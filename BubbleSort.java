package algorithmsandproblems;

public class BubbleSort {
    public static void main(String[] args) {
        int []y={3,2,1,4,5,6};
        BubbleSort(y);
        for (int l:y){
            System.out.print(l+" ");
        }
    }
    public static void BubbleSort(int[]a){
        int n=a.length;
        for (int i=0;i<n-1;i++){
            boolean diISwap=false;
            for (int j=0;j<n-i-1;j++){
                if (a[j+1]<a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    diISwap=true;
                }

            }
            if (!diISwap)break;
        }
    }
}

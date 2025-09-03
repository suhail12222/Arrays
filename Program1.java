package algorithmsandproblems;
//WAJP to sort the array elements in descending
//order.
public class Program1 {
    public static void main(String[] args){
        int []a={3,4,2,1,4,5};
        sortInDecending(a);
        for (int o:a){
            System.out.print(o+" ");
        }
    }
    public static void sortInDecending(int[]a){
        int n=a.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[i] < a[j]){   // for descending order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;   // fixed swap
                }
            }
        }
    }
}

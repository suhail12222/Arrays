package algorithmsandproblems;
//WAJP to sort the array elements in ascending
//order by implementing Insertion sort algorithm
public class Program18 {
    public static void main(String[] args) {
        int []a={3,2,1,4,5,6,3};
        insertionSort(a);
        for (int as:a){
            System.out.print(as+" ");
        }

    }
    public static void insertionSort(int []s){
        int n=s.length;
        for (int i=0;i<n;i++){
            int last=s[i];
          int swapIdex=i-1;
          while(swapIdex>=0&&s[swapIdex]>last){
              swapIdex--;


          }
          int j=i;
          while(j>swapIdex+1){
              s[j]=s[j-1];
              j--;
          }
          s[swapIdex+1]=last;

        }
    }
}

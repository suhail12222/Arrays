package algorithmsandproblems;

import java.util.Arrays;

//WAJP to print first half of the array elements in
//ascending order and second half of the
//elements in descending order.
//
//i/p:
//[25, 34, 12, 45, 23, 28]
//
//o/p:
//[12, 25, 34, 45, 28, 23]
public class Program3 {
    public static void main(String[] args) {
        int []a={25,34,12,45,23,28};
       int []as= sortArrayAccordingToRequierment(a);
        for (int i:as){
            System.out.print(i+" ");
        }

    }
    public static int [] sortArrayAccordingToRequierment(int a[]){

        int n=a.length;
        int mid=a.length/2;
        int []left= Arrays.copyOfRange(a,0,mid);
        sort(left);
        int []right=Arrays.copyOfRange(a,mid,n);
        sort(right);
        reverse(right);
        int []collected=new int[a.length];
      for (int i=0;i<left.length;i++){
          collected[i]=left[i];
      }
      for (int i=0;i<right.length;i++){
          collected[mid+i]=right[i];
      }
 return collected;
    }
   public static void sort(int []y){
       int n=y.length;
       for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               if (y[i]>y[j]){
                   int temp=y[i];
                   y[i]=y[j];
                   y[j]=temp;
               }
           }

       }
   }
    public static void reverse(int []a){
      int i=0;
      int j=a.length-1;
      while(i<j){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;
          j--;
      }
    }
}

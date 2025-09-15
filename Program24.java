package algorithmsandproblems;
//WAJP to rotate all the elements of array k
//position to its right.
//orginal array={1,2,3,4,5,6,7};
//k=2
//Output: {6, 7, 1, 2, 3, 4, 5}
public class Program24 {
    public static void main(String[] args){
int []orginal={1,2,3,4,5,6,7};
int k=2;
int []result=getRotatedArray(orginal,k);
for (int i:result){
    System.out.print(i+" ");
}
    }
    public static int[] getRotatedArray(int []a,int k){
        int n=a.length;
        k=k%n;
        int []result=new int[n];
        int index=0;
        // Step 1: copy last k elements
       for (int i=n-k;i<n;i++){
           result[index++]=a[i];
       }
       for (int i=0;i<n-k;i++){
           result[index++]=a[i];
       }
        return result;
    }
}

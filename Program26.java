package algorithmsandproblems;

import java.util.Arrays;

//WAJP to rotate all the elements of array k
//position to its left.
//
//array[] = {1, 2, 3, 4, 5, 6, 7}
//
//k = 2
//
//Output: {3, 4, 5, 6, 7, 1, 2}
public class Program26 {
    public static void main(String[] args){
        int []orginall={1,2,3,4,5,6,7};
        int k=2;
        rotateLeftArrayKTimes(orginall,k);
        for (int i:orginall){
            System.out.print(i+" ");
        }
    }
    public static void rotateLeftArrayKTimes(int []a,int k){
        int n=a.length;
        int [] result=new int[n];
        k=k%n;
        int index=0;
   for (int i=k;i<n;i++){
       result[index++]=a[i];
   }
   for (int i=0;i<k;i++){
       result[index++]=a[i];
   }
    }
}

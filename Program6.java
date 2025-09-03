package algorithmsandproblems;
//WAJP to merge two arrays into a single array.
//
//i/p:
//
//arr1 = {1, 3, 5}
//
//arr2 = {2, 4, 6, 8, 10}
//
//merged: {1, 3, 5, 2, 4, 6, 8, 10}
public class Program6 {
    public static void main(String[] args){
        int [] arr={1,3,5};
        int [] arr2={2,4,6,8,10};
        int []resultant=merge(arr,arr2);
        for(int i:resultant){
            System.out.print(i+" ");
        }
    }
    public static int[] merge(int []a,int []b){
        int [] resultant=new int[a.length+b.length];
       int index=0;
       int i=0;
               int y=0;
               while(i<a.length){
                   resultant[index++]=a[i++];
               }
               while(y<b.length){
                   resultant[index++]=b[y++];
               }

               return resultant;
    }
}

package algorithmsandproblems;
//Merge two sorted array in sorted manner.
//
//i/p:
//
//arr1 = {20, 30, 50, 60}
//
//arr2 = {2, 28, 32, 35, 42}
//
//merged: {2, 20, 28, 30, 32, 35, 42, 50, 60}

public class Program8 {
    public static void main(String[] args){
     int []arr1 = {20, 30, 50, 60};
     int []arr2 = {2, 28, 32, 35, 42};
int []result=mergeTwoMergedArrays(arr1,arr2);
for (int o:result){
    System.out.print(o+" ");
}
    }
    public static int[] mergeTwoMergedArrays(int []a,int[]b){
        int []merged=new int[a.length+b.length];
  int i=0;int j=0;int k=0;
  while(i<a.length&&j<b.length){
      if (a[i] <= b[j]) {
          merged[k++] = a[i++];
      } else {
          merged[k++] = b[j++];
      }
  }
  while(i<a.length){
      merged[k++]=a[i++];
  }
  while(j<b.length){
      merged[k++]=b[j++];
  }
  return merged;
    }
}

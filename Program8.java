package algorithmsandproblems;
//WAJP to move all zeroes of an array to the end.
//
//i/p: [7, 0, 2, 6, 0, 4]
//
//o/p: [7, 2, 6, 4, 0, 0]
public class Program8 {
    public static void main(String[]args){
  int []a={7,0,2,6,0,4};

  shift(a);
  for (int o:a){
      System.out.print(o+" ");
  }
  int []n=shiftZeros(a);
//  for (int i:n){
//      System.out.print(i+" ");
//  }
    }
    public static int[] shiftZeros(int []a){
        int n=a.length;
        int count=0;
        int []shiftedArray=new int[n];
        int index=0;
        //
       for (int i=0;i<n;i++){
           if (a[i]!=0){
               shiftedArray[index++]=a[i];
           }
       }
return shiftedArray;
    }




    public static void shift(int []a){
        int n=a.length;
        int index=0;
        for (int i=0;i<n;i++){
            if (a[i]!=0){
                a[index++]=a[i];
            }
        }
        while (index<n){
            a[index++]=0;
        }
    }
}

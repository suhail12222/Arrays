package algorithmsandproblems;
//WAJP the shift all 0’s to left and all 1’s to the
//right(Without Sorting).
//
//i/p:
//[0, 1, 1, 0, 0, 1, 0, 0]
//
//o/p:
//[0, 0, 0, 0, 0, 1, 1, 1]
public class Program9 {

    public static void main(String[] args) {
      int []ele={0,1,1,0,0,1,0,0};
      shiting(ele);
      for (int p:ele){
          System.out.print(p+" ");
      }
    }
    public static void shiting(int []a){
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

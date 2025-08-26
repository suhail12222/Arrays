package algorithmsandproblems;
/**WAJP to move all zeroes of an array to the end.

        i/p: [7, 0, 2, 6, 0, 4]

o/p: [7, 2, 6, 4, 0, 0]**/
public class Program9 {
    public static void main(String[] args) {
        int []input={7,0,2,6,0,4};
  moveZerosToRight(input);
  for (int num:input){
      System.out.print(num+" ");
  }
    }
    public static void moveZerosToRight(int []a){
        int n=a.length;
        int j=0;
        //filing numbers which are non zeros
        for (int i=0;i<n;i++){
            if (a[i]!=0){
                a[j]=a[i];
                j++;
            }
        }



        //filling 0's at the end
        while(j<n){
            a[j]=0;
            j++;
        }
    }
}

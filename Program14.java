package algorithmsandproblems;
//WAJP to print true if all the elements in two
//arrays are same otherwise print false.
public class Program14 {
    public static void main(String[] args) {
        int []first={4,3,2,1};
        int[]second={3,4,2,1};
        System.out.println(isSame(first,second));
    }
    public static boolean isSame(int[]a,int[] b){
        int n=a.length;
        int n1=b.length;
        boolean isSame=true;
        if (n!=n1){
            return false;
        }
        BubbleSort.BubbleSort(a);
        BubbleSort.BubbleSort(b);
        int y=0;
       for (int i=0;i<n;i++){
           if (a[i]!=b[y]){
              return isSame=false;

           }
           y++;
       }
        return isSame;
    }
}

package algorithmsandproblems;
//WAJP to print each element of the array which
//has appeared more than once/which has
//duplicate values in the array.
public class Program1 {
    public static void main(String[] args) {
        int []a={3,2,1,4,2,3,1};
        getDuplicates(a);
    }
    public static void getDuplicates(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[j]==a[i]){
                    System.out.print(a[i]+" ");
break;
                }

            }
        }
    }
}

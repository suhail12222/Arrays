package algorithmsandproblems;
//WAJP to print the element of the array which
//has appeared only once in the array. Given that
//only one element has appeared once in the
//array.
public class Program2 {
    public static void main(String[] args) {
        int []a={1,2,2,3,3,4,4};
        findSingleNumberPresence(a);
    }
    public static void findSingleNumberPresence(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            boolean isUnique=true;
            for (int j=0;j<n;j++){
                if (i!=j&&a[i]==a[j]){
                    isUnique=false;
                    break;
                }
            }
            if (isUnique)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}

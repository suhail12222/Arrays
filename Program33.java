package algorithmsandproblems;

public class Program33 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 5};
        findUniqueElement(arr);
    }
    public static void findUniqueElement(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            boolean isUnique=true;
            for (int j=0;j<n;j++)
            {
                if (i!=j&&a[i]==a[j]){
                    isUnique=false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(a[i]);

            }
        }
    }
}

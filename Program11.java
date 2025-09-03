package algorithmsandproblems;
//WAJP to print true if all the elements in the
//array are unique otherwise false.
public class Program11 {
    public static void main(String[] args) {
        int []a={2,3,1,5,5,4,8,6,7};
        if (isUnique(a)){
            System.out.println("elements in an array are unique");

        } else  {
            System.out.println("not unique");
        }
    }
    public static boolean isUnique(int []a){
        int n=a.length;

        sort(a);
        for (int i=0;i<n-1;i++){
            if (a[i]==a[i+1]){
                return false;
            }

        }
        return true;
    }
    public static int[] sort(int []a){
        int  n=a.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
}

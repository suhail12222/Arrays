package algorithmsandproblems;
//WAJP to print true if all the elements in two
//arrays are same otherwise print false.
public class Program12 {
    public static void main(String[]args){
        int a[]={7,5,6,1,2,4,3};
        int b[]={7,5,6,1,2,4,3,8};
        boolean result=isSame(a,b);
        if (result){
            System.out.println("elements in the array are same "+result);
        }
        else {
            System.out.println("elemets in an array are not same "+result);
        }
    }
    public static boolean isSame(int[]a,int []b){
        if (a.length!=b.length)return false;
        sort(a);
        sort(b);
        int n=a.length;
        for (int i=0;i<n;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public static int [] sort(int a[]){
        int n=a.length;
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

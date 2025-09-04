package algorithmsandproblems;
//WAJP to swap two index values of the array.
//orginal 10,20,30,40,50,60,70
//swappedArray 10,60,30,40,50,20,70
public class Program17 {
    public static void main(String[] args) {
        int []orginal={10,20,30,40,50,60,70};
        int []reversed=swapTwoIndexValuesOfArray(orginal,1,5);
        for (int o:reversed){
            System.out.print(o+" ");
        }
    }
    public static int [] swapTwoIndexValuesOfArray(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return a;

    }
}

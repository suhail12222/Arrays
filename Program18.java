package algorithmsandproblems;
//WAJP to reverse each element of the array.
//orginal array 10,20,30,40,50,60,70
// reversed array 70,60,50,40,30,20,10
public class Program18 {
    public static void main(String[]args){
        int []orginal={10,20,30,40,50,60,70};
        int []reversed=reversedArray(orginal);
        for (int o:reversed){
            System.out.print(o+" ");
        }
    }
    public static int [] reversedArray(int[]a){
        int n=a.length;
        for (int i=0;i<n/2;i++){//because we are swapping twom ;elements in an array two times so we have to go through half iterations:
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;

        }
        return a;
    }
}

package algorithmsandproblems;
//WAJP to rotate each element of an array by
//one position in left side.
//orginal array: 10,20,30,40,50,60,70
//rotated array : 20,30,40,50,60,70,10
public class Program25 {
    public static void main(String[] args){
        int []orginal={10,20,30,40,50,60,70};
        rotateArrayByOnePositionInLeft(orginal);
        for (int o:orginal){
            System.out.print(o+" ");
        }
    }
    public static void rotateArrayByOnePositionInLeft(int []a){
        int n=a.length;
        int []result=new int[n];
        result[n-1]=a[0];
        for (int i=1;i<n;i++){
            result[i-1]=a[i];
        }
        for (int i=0;i<n;i++){
           a[i]=result[i];
        }
    }
}

package algorithmsandproblems;
//WAJP to rotate each element of an array by
//one position in right side.
//orginal array :={10,20,30,40,50,60,70}
//rotated Aara={70,10,20,30,40,50,60}
public class Program23 {
    public static  void main(String[] args){
int []orginal={10,20,30,40,50,60,70};
int []result=rotateArrayByOnePosition(orginal);
for (int i:result){
    System.out.print(i+" ");
}
    }
    public static int [] rotateArrayByOnePosition(int []a){
        int n=a.length;
        int []result=new int [n];
        result[0]=a[n-1];//store last element at first position
        for (int i=0;i<n-1;i++){
            result[i+1]=a[i];
        }
        return result;
    }


}

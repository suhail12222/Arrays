package algorithmsandproblems;
//WAJP to insert an element at certain position
//of the array.
//orginal array={10,20,30,40,50,60,70}
//inserted array={10,20,30,35,40,50,60,70}
public class Program22 {
    public static void main(String[] args) {
   int [] orginal={10,20,30,40,50,60,70};
   int index=3;
   int elementToBeInserted=35;
   int []result=insertedElementAtCertianPositon(orginal,elementToBeInserted,index);
   for (int i:result){
       System.out.print(i+" ");
   }
    }
    public static int [] insertedElementAtCertianPositon(int []a,int element,int index){
        int n=a.length;
        int []result=new int[n+1];
        int j=0;
        for (int i=0;i<n;i++){

            if (i==index){
                result[j++]=element;

            }
            result[j++]=a[i];

        }
        return result;
    }
}

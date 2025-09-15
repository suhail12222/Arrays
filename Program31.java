package algorithmsandproblems;

public class Program31 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9,1,2,3,4,5,7,-9,8};
      int []reesult=  removeDuplicateEklements(a);
 for (int p:reesult){
     System.out.print(p+" ");
 }
    }
    public static int [] removeDuplicateEklements(int []a){
        int min=a[0];
        int max=a[0];
        //finds min and max for range
        for (int num:a){
            if (num<min)min=num;
            if (num>max)max=num;

        }
        // create freq array of size max-min+1
        int []freq=new int[max-min+1];
        // store frequency of each element
        for (int num:a){
            freq[num-min]++;
        }
        int isUnique=0;

        for (int o:freq){
            if (o>0)isUnique++;
        }
        int []result=new int[isUnique];
        int index=0;
        for (int i=0;i<freq.length;i++){
            if (freq[i]>0)
            {
                result[index++]=i+min;
            }
        }
       return  result;

    }
}

package algorithmsandproblems;
//WAJP for below requirements:
//
//Shambhu Kumar QSpiders | JSpiders,
//NOIDA
//
//Q:#
//
//Original array:
// 2 5 4 3 6
//resultant array:18 15 16 17 14

public class Program4 {
    public static void main (String[] args){
       //what we see in this question we have to return resultant array where we have to ignore the element and add other elements
   int [] orginal={2,5,4,3,6};
//   int []result=getResultant(orginal);
//   for (int y:result){
//       System.out.print(y+" ");
//   }
       int y[]= optimisedSolution(orginal);
        for (int o:y){
            System.out.print(o+" ");
        }

    }
    public static int[] getResultant(int []a){
        int n=a.length;
        int []resultant=new int[a.length];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i!=j){
                    resultant[i]+=a[j];
                }
            }
        }
        return resultant;
    }
    public static int [] optimisedSolution(int []y){
        int [] resultant=new int[y.length];
        int total=0;
        for (int n:y){
            total+=n;
        }
        for (int i=0;i<y.length;i++){
            resultant[i]=total-y[i];

        }
        return  resultant;
    }
}

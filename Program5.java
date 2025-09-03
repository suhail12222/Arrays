package algorithmsandproblems;

public class Program5 {
    public static void main(String[] args){
        int [] orginal={2,5,4,3,6};
        int [] result=getDesiredOutput(orginal);
        for (int u:result){
            System.out.print(u+" ");
        }

    }
    public static int[] getDesiredOutput(int []a){
        int [] resultant=new int[a.length];
        int product=1;
        for (int y:a){
            product*=y;
        }
        for (int i=0;i<a.length;i++){
            resultant[i]=product/a[i];
        }
        return resultant;
    }
}

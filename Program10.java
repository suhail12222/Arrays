package algorithmsandproblems;

public class Program10 {
    public static void main(String[] args) {
int [] arr={1,2,1};
int []result=concatination(arr);
for (int i:result){
    System.out.print(i+" ");
}
    }
    public static int [] concatination(int []a){
        int n=a.length;
        int []result=new int[n*2];
        for (int i=0;i<n*2;i++){
            result[i]=a[i%n];//because to copy to same element that is why i use this
        }
        return result;
    }

}

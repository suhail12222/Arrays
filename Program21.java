package algorithmsandproblems;
//WAJP to remove an element from the certain
//position of the array.
//origial array={10,20,30,40,50,60,70}
public class Program21 {
    public static void main(String[] args) {
int []orginal={10,20,30,40,50,60,70};
int removedIndex=2;
        int [] result=removeElementFromArray(orginal,removedIndex);
        for (int i:result){
            System.out.print(i+" ");
        }
    }
    public static int [] removeElementFromArray(int []a,int index){
        int n=a.length;
        if (index<0 || index>=n){
            System.out.println("Invalid index");
            return a;
        }
        //main part of the code is like
        int []result=new int[n-1];//new array of size n-
        int j=0;
        for (int i=0;i<n;i++){
            if (i==index){
                continue;
            }
            result[j++]=a[i];
        }
        return result;
    }
}

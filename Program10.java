package algorithmsandproblems;
//WAJP the shift all 0’s to left and all 1’s to the
//right(Without Sorting).
//
//i/p:
//[0, 1, 1, 0, 0, 1, 0, 0]
//
//o/p:
//[0, 0, 0, 0, 0, 1, 1, 1]
public class Program10 {
    public static void main(String[] args) {
        int []input={0,1,1,0,0,1,0,0};
        shifting(input);
        for (int num:input){
            System.out.print(num+" ");
        }
    }
    public static void shifting(int []a){
        int n=a.length;
        int j=0;
        for (int i=0;i<n;i++){
            if (a[i]!=1){
                a[j]=a[i];
                j++;
            }
        }
        while(j<n){
            a[j]=1;
            j++;
        }
    }
}

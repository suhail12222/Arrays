package algorithmsandproblems;
//WAJP to print the frequency of each element of
//the array when elements provided are in any
//range.
public class Program4 {
    public static void main(String[] args) {
        int []input={1,2,1,3,4,1,2,1};
getFrequency(input);


    }
    public static  void getFrequency(int[]a){
        int n=a.length;
        int  count=0;
        for (int i=0;i<n;i++){
            count=0;
            for (int j=0;j<n;j++){
                if (a[i]==a[j]){
                    count++;
                }
            }
            System.out.println("frequency of "+a[i]+" -> "+count);
        }


    }
}
//later update this code
package algorithmsandproblems;

public class Program29 {
    public static void main(String[]args){
        int []a={10,10,10,20,30,40,50,40,30,60,10};
        CountFrequencyofEachElementInAnArray(a);
        for (int o:a){
            System.out.print(o+" ");
        }
    }
    public static void CountFrequencyofEachElementInAnArray(int []a){
        int[] freq = new int[101];

        // count frequency
    for (int num:a){
        freq[num]++;}


    //print frequency
        for (int i=0;i< freq.length;i++){
            if (freq[i]>0){
                System.out.println("frequency of "+i+" is : "+freq[i]);
            }
        }
    }
}

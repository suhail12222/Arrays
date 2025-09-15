package algorithmsandproblems;
//WAJP to print all the elements of array whose
//frequency are odd.
public class Program36 {
    public static void main(String[]args){
        int [] orginal={1,2,3,2,3,1,3,4,5,4,5,5,5};
        printNumbersWhoseFrequencyIsOdd(orginal);
        int[]orginal2={10,20,20,10,10,30,50,10,20};
        printNumbersWhoseFrequencyIsOdd(orginal2);
        int []orginal3={6,6,6,7,10,10,7,6,7,10,7,7,7};
        printNumbersWhoseFrequencyIsOdd(orginal3);
    }
    public static void printNumbersWhoseFrequencyIsOdd(int []a){
        int min=a[0];
        int max=a[0];
        int n=a.length;
        for (int i=0;i<n;i++){
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
        }
        int range=max-min+1;
        int frequency[]=new int[range];

        for (int i=0;i<n;i++){
            frequency[a[i]-min]++;

        }
        for (int i=0;i<range;i++){
            if (frequency[i]%2!=0){
                System.out.println(i+min);
            }
        }

    }
}

package algorithmsandproblems;
//WAJP to print all the elements of array whose
//frequency are even.
public class Program35 {
    public static void main(String[] args){
        int []orginal={1,2,3,2,4,5,6,3,1,2,4,5,6,7,8,9,7,13,13,13,12,12,12,14,14,14,15,15,15,16,16,15,10};
        printAllTheElementsOfArrayWhoseFrequencyAreEven(orginal);
    }
    public static void printAllTheElementsOfArrayWhoseFrequencyAreEven(int []a){
        int min=a[0];int max=a[0];
        for (int i:a){
            if (i<min){min=i;}
            if (i>max){max=i;}
        }


        int []freq=new int[max-min+1];
        for (int o:a){freq[o-min]++;}
        for (int i=0;i<freq.length;i++){
            if(freq[i]%2==0 &&freq[i]!=0){
                System.out.println(i+min+" "+freq[i]);
            }
        }
    }
}

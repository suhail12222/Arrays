package algorithmsandproblems;

public class Program30 {
    public static void main(String[]args){
        int []a= {1,-5,2,3,4,-5,6,7,3,2,1,0,-4};
        printFrequency(a);
    }
    public static void printFrequency(int []a){
        int min=a[0];int max=a[0];
        for (int i:a){
            if (i<min){min=i;}
            if (i>max){max=i;}
        }


        int []freq=new int[max-min+1];
        for (int o:a){freq[o-min]++;}

     for (int i=0;i<freq.length;i++){
     if (freq[i]>0){
         System.out.println("frequency of "+(i+min)+" is "+freq[i]);}
     }
    }
}

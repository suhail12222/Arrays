package algorithmsandproblems;
//WAJP to print the smaller element and its
//frequency which has appeared for the
//maximum time in the array if more than one
//elements have maximum frequency.
public class Program38 {
    public static void main(String[]args){
        int []orginal={80,80,43,50,38,63,58,80,43,43,43,50,50,50,50};
        smallerElementAndItsFrequency(orginal);

    }
    public static void smallerElementAndItsFrequency(int[]a){
        int n=a.length;
        int maxFrequency=0;
        int smallerElement=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if (a[i]==a[j])
            count++;
            }
            if (count>maxFrequency) {
                maxFrequency = count;
                smallerElement = a[i];
            }
            else if(count==maxFrequency &&a[i]<smallerElement){
                smallerElement=a[i];
            }

        }
        System.out.println(smallerElement);
    }
}

package algorithmsandproblems;
//WAJP find missing element from a given array
//which has a missing element in a range of n.
//
//N=7
//
//i/p: [7, 4,3, 0, 5, 1, 6]
//
//o/p: 2
public class Program4 {
    public static void main(String[] args) {
//        int n[]={7, 4,3, 0, 5, 1, 6};
        int n[]={4,3,2,0,1,5,6};
        int a=findMissingNumber(n);
        System.out.println(a+" is the number missing in the given array");
    }
    public static int findMissingNumber(int []a){
int missingNumber=findMinDiff(a);
return missingNumber;
    }
    public static void sort(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static int  findMinDiff(int []a){
      //min difference = sum upto n-sum of elements
        sort(a);
        int totalSum=0;
        int sumOfElements=0;
        for (int i=0;i<=a.length;i++){
            totalSum+=i;
        }
        for (int i=0;i<a.length;i++){
            sumOfElements+=a[i];
        }
      return totalSum-sumOfElements;
    }
}

package algorithmsandproblems;
//WAJP to sort the array elements in ascending
//order by implementing Selection sort algorithm
public class Program16 {
    public static void main(String[] args) {
int []input={4,2,6,5,1,3};
selectionSortInAscendingOrder(input);
for (int i:input){
    System.out.print(i+" ");
}

    }
    public static void selectionSortInAscendingOrder(int []a){
        int n=a.length;
        for (int i=0;i<n;i++){
            int minIndex=i;
            for (int j=i+1;j<n;j++){
                if (a[j]<a[minIndex]){
                    minIndex=j;//for trace out the flow
                    System.out.println(a[minIndex]);
                }
            }
            if(i!=minIndex){
            int temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    }
    }
}

package algorithmsandproblems;
//WAJP to sort the array elements in ascending
//order by implementing Merge sort algorithm.
public class Program19 {
    public static void main(String[] args) {
        // when two given arrays will be sorted and now if we have one array with unsortd order for that program no 20 is
int []a={3,4,5,6};
int []b={1,2,7};
int []combined=merge(a,b);
        for (int l:combined){
            System.out.print(l+" ");
        }
    }
    public static int [] merge(int []a,int []b){
        int []combined=new int[a.length+b.length];
        int index=0;
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if (a[i]<b[j]){
                combined[index]=a[i];
                index++;
                i++;
            }
            else {
                combined[index]=b[j];
                index++;
                j++;
            }
        }
        while(i<a.length){
            combined[index]=a[i];
            i++;
            index++;
        }
        while(j<b.length){
            combined[index]=b[j];
            j++;
            index++;
        }
        return combined;
    }
}

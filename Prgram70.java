package algorithmsandproblems;
//WAJP to sort the array elements in ascending order by implementing Insertion sort algorithm
public class Prgram70 {
    public static void main(String[] args) {
int []input={5,3,4,2,1};
inserTionSort(input);
for (int o:input){
    System.out.print(o+" ");
}
    }
    public static void inserTionSort(int[]a){
        for (int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
            while(j>=0&&a[j]>current){
a[j+1]=a[j];
j--;
            }
            a[j+1]=current;
        }

    }
}

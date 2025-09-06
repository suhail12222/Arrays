package algorithmsandproblems;
//WAJP to reverse 1st half and 2nd half elements
//of array.
//orginal array 10,20,30,40,50,60,70
//reversed array 40,30,20,10,70,60,50
public class Program19 {

    public static void main(String[] args){
        int []orginal={10,20,30,40,50,60,70};
        int []reversed=reverseFirstAndecnnd(orginal);
for (int i:reversed){
    System.out.print(i+" ");
}
    }
    public static int [] reverseFirstAndecnnd(int []a){
        int n = a.length;
        int mid = (n+1) / 2;
        int[] result = new int[n];

        // Fill first half in reverse order
        for (int i = 0; i < mid; i++) {
            result[i] = a[mid - 1 - i];
        }

        // Fill second half in reverse order
        for (int i = mid; i < n; i++) {
            result[i] = a[n - 1 - (i - mid)];
        }

        return result;
    }
}

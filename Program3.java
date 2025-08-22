package algorithmsandproblems;

import java.util.Arrays;

//WAJP to remove the duplicate values from the
//array.
public class Program3 {
    public static void main(String[] args) {
        int []input={1,1,2,2,3,4,4,5,5,4};
      gettingUniqu(input);
    }
    public static void gettingUniqu(int[]arr){
    int n=arr.length;
        int[] temp = new int[n];
        int k = 0; // index for temp

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // check if arr[i] already exists in temp
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // if not duplicate, store in temp
            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        // print unique elements
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");


    }
}

}

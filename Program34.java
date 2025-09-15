package algorithmsandproblems;
//aWAJP to print each element of the array which
//has appeared more than once/which has
//duplicate values in the array.
public class Program34 {
    public static void main(String[]args){
        int []ints={10,20,30,40,50,60,70,10,12,20,30};
        PrintDuplicateValuesINAnArray(ints);
    }
    public static void PrintDuplicateValuesINAnArray(int []a){
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicateFound = false;

            // check if this element was already printed before
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue; // skip

            // check duplicates
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    isDuplicateFound = true;
                    break;
                }
            }

            if (isDuplicateFound) {
                System.out.println(a[i]);
            }
        }

    }
}

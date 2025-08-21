package algorithmsandproblems;
//WAJP to print each element of the array which
//has appeared more than once/which has
//duplicate values in the array.

//    public static void main(String[] args) {
//        int []a={3,2,1,4,2,3,1};
//        getDuplicates(a);
//    }
//    public static void getDuplicates(int []a){
//        int n=a.length;
//        for (int i=0;i<n;i++){
//            boolean isPrinted=false;
//            for (int j=i+1;j<n;j++){
//
//                if (a[i]==a[j]){
//
// isPrinted=true;
// break;
//                }
//if (isPrinted)continue;
//for (int k=i+1;k<n;k++){
//    System.out.print(a[i]+ " ");
//break;
//}
//            }
//
//        }
//    }
//}
// WAJP to print each element of the array which
// has appeared more than once / which has
// duplicate values in the array.
public class Program1 {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 2, 3, 1};
        getDuplicates(a);
    }

    public static void getDuplicates(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            // check if element was already printed before
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;

            // check if element occurs again later
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
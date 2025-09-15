package algorithmsandproblems;

public class Program39 {
    public static void main(String []args){
        int []a={10,20,20,10,10,30,50,10,20};
        aximumElementAndItsFrequency(a);
    }
    public static void aximumElementAndItsFrequency(int[]a){
        int n=a.length;
        int maxFrequency=0;
        int maximum=Integer.MIN_VALUE;

        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if (a[i]==a[j]){
                    count++;
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                maximum = a[i];
            }
            // agar same max frequency mili toh bigger element lena hai
            else if (count == maxFrequency && a[i] > maximum) {
                maximum = a[i];
            }
        }

        System.out.println("Element: " + maximum);
        System.out.println("Frequency: " + maxFrequency);
    }
}

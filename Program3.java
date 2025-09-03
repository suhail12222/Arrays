package algorithmsandproblems;
//For the given array of Strings, print the largest
//string.
public class Program3 {
    public static void main(String[] args){
        String []arr={"hamza malik","ukasha malik","hamza is good man"};
printBiggestStringInAnArray(arr);
    }
    public static void printBiggestStringInAnArray(String []a){
    String assume=a[0];
//    int big=assume.length();
    for (int i=0;i<a.length;i++){
        if (assume.length()<a[i].length()){
            assume=a[i];
        }
    }
        System.out.println(assume+" is the biggest String  in an array");

    }
}

package algorithmsandproblems;
//WAJP to print each element of the array which
//has appeared only once/Unique elements in
//the array.
public class Program32 {
    public static void main(String[] args){
        int []a={10,20,30,40,50,60,70,10,20,30};printIniqueElements(a); }
    public static void printIniqueElements(int []a){
        int n=a.length;
       for (int i=0;i<n;i++) {boolean isUnique=true;
           for (int j=0;j<n;j++){if (i!=j&&a[i]==a[j]){isUnique=false;break;}}
           if (isUnique){System.out.println(a[i]);}
       }
    }
}

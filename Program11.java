package algorithmsandproblems;
//For the given array of 0’s, 1’s and 2’s
//
//Sort the elements(Without Sorting).
//
//i/p:
//[0, 2, 0, 1, 2, 1, 0, 2]
//
//o/p:
//[0, 0, 0, 1, 1, 2, 2, 2]
public class Program11 {
    public static void main(String[] args) {
int []input={0,2,0,1,2,1,0,2};
getSorted(input);
for (int num:input){
    System.out.print(num+" ");
}
    }
    public static void getSorted(int []a){
        int count0=0;
        int count1=0;
        int count2=0;
        for (int num:a){
            if (num==0)count0++;
            else if (num==1) {count1++;

            }
            else count2++;
        }
        int i=0;
        while(count0-->0){
            a[i]=0;
            i++;
        }
        while(count1-->0){
            a[i]=1;
            i++;
        }
        while(count2-->0){
            a[i]=2;
            i++;
        }
    }
}

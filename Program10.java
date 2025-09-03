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
public class Program10 {
    public static void main(String[] args){
int [] ele={0,2,0,1,2,1,0,2};
shiftingElements(ele);
for (int y:ele){
    System.out.print(y+" ");
}
    }
    public static void shiftingElements(int [] a){
        int n=a.length;
        int count0=0;
        int count1=0;
        int count2=0;
        int index=0;
        for (int num : a) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }
      while (count0-->0){
          a[index++]=0;
      }
      while (count1-->0){
          a[index++]=1;
      }
      while(count2-->0){
          a[index++]=2;
      }
    }
}

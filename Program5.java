package algorithmsandproblems;

public class Program5 {
    public static void main(String[] args) {
        int []in={0,1,1,1,0,0,1,0,1};
//        shifting(in);
        shiftingByCounter(in);
        for (int i:in){
            System.out.print(i+" ");
        }
    }
    public static void shifting(int []a){
        int n=a.length;
        //counter part;
        int count0=0;
        int count1=0;
        for (int i=0;i<n;i++){
            if (a[i]==0){
                count0++;
            }
            if (a[i]==1){
                count1++;
            }
        }
        System.out.println(count0);
        System.out.println(count1);
        //counting ends here


        for (int i=0;i<n;i++){
            if (i<count0){
                a[i]=0;
            } else  {
                a[i]=1;

            }
        }
    }






    public static void shiftingByCounter(int[]m){
        int n=m.length;
        int left=0;
        int right=n-1;
        while(left<right){
        if (m[left]==0){
            left++;

        }
        if (m[right]==1){
            right--;
        }
        if (m[left]==1&&m[right]==0){
            int temp=m[left];
            m[left]=m[right];
            m[right]=temp;
            left++;
            right--;
        }
    }}

}

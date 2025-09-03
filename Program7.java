package algorithmsandproblems;
//WAJP to zigzag merge two arrays into a single
//array.
//
//i/p:
//
//arr1 = {20, 30, 50}
//
//arr2 = {2, 4, 6, 8, 10}
//
//merged: {20, 2, 30, 4, 50, 6, 8, 10}
public class Program7 {
    public static void main(String[] args){
int []arr1 = {20, 30, 50};
int []arr2 = {2, 4, 6, 8, 10};
int []result=mergeResultant(arr1,arr2);
for (int o:result){
    System.out.print(o+" ");
}

    }
    public static int [] mergeResultant(int []a,int []b){
        int i=0;int j=0;int index=0;
        int []resultantMerge=new int[a.length+b.length];
        while(i<a.length&&j<b.length){
            resultantMerge[index++]=a[i++];
            resultantMerge[index++]=b[j++];
        }
        while(i<a.length){
            resultantMerge[index++]=a[i++];
        }
        while(j<b.length){
            resultantMerge[index++]=b[j++];
        }
        return resultantMerge;
    }
}

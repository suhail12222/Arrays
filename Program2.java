package algorithmsandproblems;

import java.util.Arrays;

//Problem Statement: In an IT company there are n number of Employees , they
//are asked to stand in ascending order according to their heights. But some
//employees are not currently standing in their correct position.
//
//Your task is to find how many employees are there who are not standing in
//their correct positions.
//
//Example
//
//height=[1,2,1,3,3,4,3]
//
//The 4 employees at indexes 1,2,5 and 6 are not in the right positions. The
//correct positions are (1,1,2,3,3,3,4).
public class Program2 {
    public static void main(String[] args) {
int []a={1,2,1,3,3,4,3};
        sort(a);
        for (int o:a){
            System.out.print(o+" ");
        }
        int nPositions=NumberOfEmployeesNotAtCorrectPosition(a);

        System.out.println("\n total no of employees which are not in the correct position "+nPositions);



    }
    public static int NumberOfEmployeesNotAtCorrectPosition(int []a){
        int n=a.length;
        int []sorted= Arrays.copyOf(a,n);
            sort(sorted);
        int counter=0;
        for (int i=0;i<n;i++){
            if (a[i]!=sorted[i]){
                counter++;
            }

        }
        return counter;
    }
    public static void sort(int y[]){
        int n=y.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (y[i]>y[j]){
                    int temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
        }
    }
}

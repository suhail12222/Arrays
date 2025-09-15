package algorithmsandproblems;
//WAJP to print the element and its frequency
//which has appeared for the maximum time in
//the array.
public class Program37 {
    public static void main(String[]args){
        int []orginal={10,20,30,40,50,60,70,10,20,10,10,10,30,30,30,30};
        elementAndItsFrequencyWhichHasAppearedForTheMaximumTimeInTheArray(orginal);
    }
    public static void elementAndItsFrequencyWhichHasAppearedForTheMaximumTimeInTheArray(int []a){
        int n=a.length;
        //
        int maxCount=0;
        //to store the element which has appeared maximum time in the array:
        int element=-1;
        //outer loop is for each element of the array:
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j
            <n;j++){
                if (a[i]==a[j]){
                    count++;

                }
            }
            if (count>maxCount){
                maxCount=count;
                element=a[i];
                System.out.println("element= "+element+ " has appeared "+maxCount+" times ");
            }

        }

    }
}

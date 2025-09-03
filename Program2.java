package algorithmsandproblems;
//For the given array of Strings, print and count
//all the Strings which has even number of
//characters.
public class Program2 {
    public static void main(String[] args){
        String []a={"hamza","suhail","malik","mother","sister"};
        printAndCountAllTheStringsWhichAreEvenInCaseOfChars(a);

    }
    public static void printAndCountAllTheStringsWhichAreEvenInCaseOfChars(String []a){
        //to find the strings which have evenNumberOfCharacters
        int count=0;
        for (String s:a){
            if (s.length()%2==0){
                System.out.println(s+" is a string with even number of characters");
            count++;
            }
        }
        System.out.println(count);
    }
}

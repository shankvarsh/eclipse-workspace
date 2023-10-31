package sem2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LineOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringofnumbers = new String();
        System.out.println("Enter the string of numbers: ");
        stringofnumbers=sc.nextLine();
        StringTokenizer st= new StringTokenizer(stringofnumbers);
        int[] arr=new int[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        int sum=0;
        System.out.println("The entered numbers are: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("Sum: "+sum);



    }
}

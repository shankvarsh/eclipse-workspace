package sem2;
import java.util.Scanner;

public class LetterCount {

    static void letterCount(String stri){
        for (int i=0;i<stri.length();i++){
            int count =0;
            for(int j=0;j<stri.length();j++){
                if(stri.charAt(i)==stri.charAt(j)){
                    count++;
                }
            }
            System.out.println("Count of \'"+stri.charAt(i)+"\' :  "+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string to find the count of: ");
        String string = sc.nextLine();
        letterCount(string);
        sc.close();
    }
}


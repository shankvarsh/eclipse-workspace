package sem2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FrequencyOfWords {

    static void frequency(String []str){
        for(int i=0;i<str.length;i++){
            int count=0;
            for(int j=0;j<str.length;j++){
                if(str[i].equalsIgnoreCase(str[j])){
                    count++;
                }
            }
            System.out.println("Count of \'"+str[i]+"\' :"+count);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Paragraph of words: ");
        String str =new String(); 
        str=sc.nextLine();
        StringTokenizer sto = new StringTokenizer(str);
        String[] words =new String[sto.countTokens()];
        for(int i=0;i<words.length;i++){
            words[i]=sto.nextToken();
        }
        frequency(words);
        sc.close();
    }
}

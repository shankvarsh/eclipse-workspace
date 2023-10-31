package sem2;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        boolean flag =true;
        while(left<=right){
            if(flag==true&&s.charAt(left)==s.charAt(right)){
                flag=true;
            }else{
                flag=false;
            }
            left++;
            right--;
        }
       return flag;
    }

    static boolean recPalindrome(String s,int l,int r){
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        if (l<r){
            recPalindrome(s, l+1, r-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        String str = new String(sc.nextLine());
        
        System.out.println("enter \n 1. For Recurion function \n 2. For Non-recursive function");
        int number=sc.nextInt();
        switch(number)
        {
        case 1: System.out.println("Recursion");
        if(recPalindrome(str,0,str.length()-1)){
            System.out.println("It's a Palindrome!!");
        }
        else{
            System.out.println("It's not a palindrome");}
        	break;
       
        case 2: System.out.println("Non-Recursion");
        if(isPalindrome(str)){
            System.out.println("It's a Palindrome!!");
        }
        else{
            System.out.println("It's not a palindrome");}
        	break;
        }
        
        sc.close();
    }
}

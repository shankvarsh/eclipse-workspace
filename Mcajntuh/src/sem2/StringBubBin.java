package sem2;

import java.util.Scanner;

public class StringBubBin {
    static void bubbleSortNames(String[] s){
        for (int i=0;i<s.length;i++){
            for(int j=0;j<s.length-i-1;j++){
                if(s[j].compareTo(s[j+1])>0){
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }
    static void binarySearch(String []s,String key){
        boolean found = false;
        int min=0,max=s.length-1;
        while(min<=max&&found==false){
            int mid=(min+max)/2;
            if(key.equalsIgnoreCase(s[mid])){
                found=true;
                System.out.println("\'"+key+"\' found at index: "+mid);
                break;
            }
            if(key.compareToIgnoreCase(s[mid])<0){
                max=mid-1;
            }else if(key.compareToIgnoreCase(s[mid])>0){
                min=mid+1;
            }
        }
        if(found==false)
            System.out.println("\'"+key+"\' not found in the list of names.");
        
    }
    static void printArray(String[] s){
        for(int i=0;i<s.length;i++)
             System.out.print(s[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names to be in the list: ");
        int n =sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names for the list");
        for (int i=0;i<names.length;i++)
            names[i]=sc.next();
        System.out.println("Names are: ");
        printArray(names);
        bubbleSortNames(names);
        System.out.println("After sorting, we get");
        printArray(names);
        System.out.println("Enter a name to search");
        String key = sc.next();
        binarySearch(names, key);
        sc.close();
        
    }
}


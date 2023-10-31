package pract;
import java.util.Scanner;
public class CharacterSearch {
public static int LinearSearch(char a[], char key, int n) {
for (int i = 0; i < n; i++) {
if (key == a[i])
return i;
}
return -1;
}
public static int LinearSearchRecursive(char a[], int key, int n, int i) {
if (n <= i)
return -1;
if (key == a[i])
return i;
return LinearSearchRecursive(a, key, n, i + 1);
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the value for n");
int n = sc.nextInt();
char a[] = new char[n];
System.out.println("enter the array elements");
for (int i = 0; i < n; i++) {
a[i] = sc.next().charAt(0);
}
char key;
System.out.println("enter the value for key");
key = sc.next().charAt(0);
System.out.println("enter the choice: ");
System.out.println("1.Search using non recursive linear search method\n2.Search using recursive linear search method");
int choice = sc.nextInt();
sc.close();
switch (choice) {
case 1:
int l1 = LinearSearch(a, key, n); 
if (l1 == -1)
System.out.println("key not found");
else
System.out.println("search is successful using non recursive method \'"+key+"\' is at location " + l1);
break;
case 2:
int l2 = LinearSearchRecursive(a, key, n, 0);
if (l2 == -1)
System.out.println("key not found");
else
System.out.println("search is successful using recursive method \'"+key+"\' is at location " + 
l2);
break;
}
}
}



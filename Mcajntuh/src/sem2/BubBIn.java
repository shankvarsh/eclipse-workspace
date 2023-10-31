package sem2;
import java.util.*;
public class BubBIn {
static void bub(int arr[])
{
	int temp;
	int n=arr.length;
	for(int i=0;i<n;++i)
	{
		for (int j=1;j<n-i;++j)
		{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
}
static int binarySearch(int a[], int beg, int end, int key)    
{    
    int mid;    
    while(end >= beg)     
    {  
        mid = (beg + end)/2;    
        if(a[mid] == key)    
        {    
            return mid+1;  
        }    
        
        else if(a[mid] < key)     
        {  
            beg=mid+1;    
        }    
      
        else    
        {  
            end=mid-1;    
        }    
    }    
    return -1;    
}   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubBIn ok=new BubBIn();
		Scanner s=new Scanner(System.in);
System.out.println("Enter the no. of elements");
int n=s.nextInt();

System.out.println("Enter the elements");
int arr[]=new int[n];
for(int i=0; i<n;++i)
{
	arr[i]=s.nextInt();
}
System.out.println("The array is: ");
for(int i=0; i<n;++i)
{
	System.out.println(arr[i]);
}
bub(arr);
System.out.println("The sorted array is: ");
for(int i=0; i<n;++i)
{
	System.out.println(arr[i]);
}
int k=arr.length;
System.out.println("Enter the key element");
int key=s.nextInt();

int result= ok.binarySearch(arr,0,k-1,key);
if(result==-1)
{
	System.out.println("Element not found");
}
else
{
	System.out.println("Element found at "+result);
}
	}

}

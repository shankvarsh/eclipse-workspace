package sem2;

import java.util.Scanner;

public class testarr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		Scanner ip=new Scanner(System.in);
		int i,j,n,e,temp;
		int flag=0;
		System.out.println(" enter the size of the array");
		n=ip.nextInt();
		arr=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
			arr[i]=ip.nextInt();
		}
		
		System.out.println("the elements of unsorted array");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if (arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("elements of sorted array");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}

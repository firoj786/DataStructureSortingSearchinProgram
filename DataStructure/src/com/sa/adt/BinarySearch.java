package com.sa.adt;
import java.util.Scanner;
public class BinarySearch {
public static void main(String[] args) {
		int i,j,temp,s,n,low,mid,high;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limilt : ");
		int a[]=new int[5];
		n=sc.nextInt();
		System.out.println("Enter the elements\t:");
		for(i=0;i<n;i++)
		{
      a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
		  for(j=0;j<n-1;j++)
		  {
		    if(a[j]>a[j+1])
		    {
		      temp=a[j];
		      a[j]=a[j+1];
		      a[j+1]=temp;
		    }
		  }
		}
		System.out.println("Sorted list:");
		for(i=0;i<n;i++)
		{
			System.out.println("\t"+a[i]);
		}
		System.out.println("Enter the elements to be searched : ");
      s=sc.nextInt();
       high=n-1;
		low=0;
		while(low<=high)
		{
			 mid=(low+high)/2;
			 if(s>a[mid])
			 low=mid+1;
			 else if(s<a[mid])
			 high=mid-1;
			 else if(s==a[mid])
			{
				 System.out.println("The element is found:"+s);
				}
		 }
		System.out.println("The element is not found:"+s);
	}
}

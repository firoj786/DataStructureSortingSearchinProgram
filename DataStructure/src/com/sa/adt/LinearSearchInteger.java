package com.sa.adt;
public class LinearSearchInteger {
public static void main(String[] args) {
         int [] arr= {5,3,6,1,4,7};
         int item=7;
         int temp=0;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]==item) {
        		 System.out.println("Element is Present:"+i+"\tIndex Position");
        		 temp=temp+1;
        	 }
         }
         if(temp==0) {
        	 System.out.println("Item not found is list");
         }
	}

}

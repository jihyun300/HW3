package hw3_package;

import java.util.Scanner;

public class KeySearch {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter six Numbers(in ascending order): ");
		int arr[]=new int[6];
		int key;
		int keyIndex;
		for(int i=0;i<6;i++){
			arr[i]=input.nextInt();
		}
		System.out.print("Enter a number to search: ");
		key=input.nextInt();
		keyIndex=binarySearch(arr,key);
		System.out.printf("Element is found at %d position\n",keyIndex+1);
	}
	public static int binarySearch(int[] list,int key){
		
		int low=0;
		int high=list.length-1;
		
		while(low<=high){
		int mid=(low+high)/2;
		if(key<list[mid]){
			high=mid-1;
		}
		else if(key==list[mid]){
			return mid;
		}
		else
			low=mid+1;
		
		}
		return -low-1;
	}

}

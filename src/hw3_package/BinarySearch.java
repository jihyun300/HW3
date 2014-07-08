package hw3_package;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int key;
		int keyIndex;
		Scanner input=new Scanner(System.in);
		Scanner inputL=new Scanner(System.in);
		System.out.print("Enter ten Numbers(integer): ");
		int arr[]=new int[10];
		
		for(int i=0;i<10;i++){
			arr[i]=input.nextInt();
		}
		insertionSort(arr);
		System.out.println("Inputs are sorted!");
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		
		System.out.print("\nEnter a number to search(sorting이 된 상태에서의 위치): ");
		key=input.nextInt();
		keyIndex=binarySearch(arr,key);
		System.out.printf("Element is found at %d position\n",keyIndex+1);
//////////////////////////long/////////////////////////
		System.out.print("Enter ten Numbers(long): ");
		long arrL[]=new long[10];
		
		for(int i=0;i<10;i++){
			arrL[i]=inputL.nextLong();
		}
		insertionSort(arrL);
		System.out.println("Inputs are sorted!");
		for(int i=0;i<10;i++)
			System.out.print(arrL[i]+" ");
		
		long keyL;
		System.out.printf("\n\nEnter a number to search(sorting이 된 상태에서의 위치): ");
		keyL=inputL.nextLong();
		keyIndex=binarySearch(arrL,keyL);
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

	public static int binarySearch(long[] list,long key){
		
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
	
	public static void insertionSort(int[] list){
		for(int i=1;i<list.length;i++){
			int currentElement=list[i];
			int k;
			for(k=i-1;k>=0&&list[k]>currentElement;k--){
				list[k+1]=list[k];
			}
			list[k+1]=currentElement;
		}
		
	}
	public static void insertionSort(long[] list){
		for(int i=1;i<list.length;i++){
			long currentElement=list[i];
			int k;
			for(k=i-1;k>=0&&list[k]>currentElement;k--){
				list[k+1]=list[k];
			}
			list[k+1]=currentElement;
		}
	}
}

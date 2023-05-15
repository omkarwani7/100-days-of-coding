//Q. write a program to perform array rotation to the left by 1.

import java.util.Scanner;

public class RotateArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		leftRotateArray(arr);
		System.out.println("Rotated array is :- ");
		for(int i=0;i<size;i++){
		    System.out.print(arr[i] + " ");
		}
	}
	
	public static void leftRotateArray(int[] arr){
	    int temp=arr[0];
	    for(int i=1;i<arr.length;i++){
	        arr[i-1]= arr[i];
	    }
	    arr[arr.length-1] = temp;
	}
}
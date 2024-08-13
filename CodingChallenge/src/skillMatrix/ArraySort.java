package skillMatrix;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter the Size:");
int size=ob.nextInt();
int arr[]=new int[size];
System.out.println("Enter the elements");
for(int i=0;i<size;i++) {
	arr[i]=ob.nextInt();
}
int temp=0;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if (arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for (int i = 0; i < arr.length; i++) { 
    System.out.print(arr[i] + " "); 
  } 
	}

}
package skillMatrix;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter the size:");
int size=ob.nextInt();
int array[]=new int[size];
System.out.println("Enter the elements");
for(int i=0;i<size;i++) {
	array[i]=ob.nextInt();
	
}
int max=array[0];
for(int i=0;i<array.length;i++) {
	if(max<array[i]) {
		max=array[i];
	}
}
System.out.println("The largest number is :"+max);
	}

}

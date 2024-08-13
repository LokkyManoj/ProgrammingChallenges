package skillMatrix;

import java.util.Scanner;

public class GeneratePrimeNumbers {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter a:");
int a=ob.nextInt();
System.out.println("Enter b:");
int b=ob.nextInt();
for(int i=a;i<b;i++) {
	int count=0;
	for(int j=2;j<i;j++) {
		if(i%j==0) {
		count++;
		break;
		}
		if(count==0) {
			System.out.println(i);
			break;
		}
	}

}
	}

}

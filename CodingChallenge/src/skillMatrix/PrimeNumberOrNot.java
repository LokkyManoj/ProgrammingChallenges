package skillMatrix;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter a number:");
int n=ob.nextInt();
for(int i=2;i<n;i++) {
	if(n%i==0) {
		System.out.println("This is not Prime Number");
		break;
	}
	else {
		System.out.println("This is  Prime number");
		break;
	}
}
	}

}

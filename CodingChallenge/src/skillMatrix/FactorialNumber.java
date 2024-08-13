package skillMatrix;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=ob.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;

		}
		System.out.println(sum);

	}

}

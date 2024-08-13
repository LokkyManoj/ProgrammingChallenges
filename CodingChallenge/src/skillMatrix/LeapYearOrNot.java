package skillMatrix;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=scanner.nextInt();
		if(year%400==0) {
			System.out.println("This is Leap year");
		}
		
		else if(year%4==0&&year%100!=0) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This is not leap year");
		}
	}

}

package skillMatrix;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter a number:");
int n=ob.nextInt();
int rev=0,temp;
int num=n;
while(num>0) {
	temp=num%10;
	rev=(rev*10)+temp;
num=num/10;	
}
if(rev==n) {
	System.out.println("This is Palindrome");
}
else {
	System.out.println("This is not palindrome");
}
	}

}

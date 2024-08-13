package skillMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		char arr[]=str.toCharArray();
		char arr1[]=str1.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		if(Arrays.equals(arr,arr1))
		{
		System.out.println("Anagram");
		}
		else
		{
		System.out.println("Not a Anagram");
		}

	}
}



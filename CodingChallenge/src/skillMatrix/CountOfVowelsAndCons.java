package skillMatrix;

import java.util.Scanner;

public class CountOfVowelsAndCons {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the String:");
		String word=ob.next();
		char[] c=word.toCharArray();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
				vowel++;
			}else {
				consonant++;
			}
			
		}
		
		System.out.println("Vowels count:"+vowel);
		System.out.println("Consonants count:"+consonant);

	}

}

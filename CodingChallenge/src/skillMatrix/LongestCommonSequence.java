package skillMatrix;

import java.util.Scanner;

public class LongestCommonSequence {

	public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
System.out.println("Enter String 1:");
String str1=ob.next();
System.out.println("Enter String 2:");
String str2=ob.next();

StringBuilder commonChars = new StringBuilder();
for (char c : str1.toCharArray()) {
    if (str2.indexOf(c) != -1) {
        commonChars.append(c);
    }
}

StringBuilder result = new StringBuilder();
for (int i = 0; i < commonChars.length(); i++) {
    char c = commonChars.charAt(i);
    if (result.indexOf(String.valueOf(c)) == -1) {
        result.append(c);
    }
}
System.out.println("The Longest Common Sequence is:"+result.toString());
}
}

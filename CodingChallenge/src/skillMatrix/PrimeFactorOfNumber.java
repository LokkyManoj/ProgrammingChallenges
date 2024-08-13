package skillMatrix;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorOfNumber {

	public static void main(String[] args) {
		int num = 90;
		int count = 0;
		List primeFactors = new ArrayList();
		for (int i = 2; i < num; i++) {
		if (num % i == 0) {
		for (int j = 2; j < i; j++) {
		if (i % j == 0)
		count += 1;
		}
		if (count == 0)
		primeFactors.add(i);
		}
		}
		System.out.println("The prime factors of number " + num +" is " + primeFactors);
	}

}

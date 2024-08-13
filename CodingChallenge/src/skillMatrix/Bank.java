package skillMatrix;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {
	
	String name;
String accountNumber;
	String IFSC;
	static Double existingBalance=10000.0;

	Double withDrawal;
	Double deposit;
	

	public static void main(String[] args) {

		
		String name;
        long accountNumber;
        String IFSC;
        double existingBalance = 10000.0;
        double withDrawal;

        ArrayList userData = new ArrayList<>();
        
        String namePattern = "^[A-Za-z]+$";
        String accountNumberPattern = "^\\d+$";
        String IFSCPattern = "^[A-Z]{4}[0][0-9]{6}$";
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        name = scanner.nextLine();
        
        
        while(!name.matches(namePattern) || name.length() < 5) {
            System.out.println("Invalid UserName: ");
            name = scanner.nextLine();
        }
        
        userData.add(name);
        try {
            System.out.println("Enter your Account Number : ");
            accountNumber = scanner.nextLong();
            String accountNumberStr = String.valueOf(accountNumber);

            while(!accountNumberStr.matches(accountNumberPattern) || accountNumberStr.length() != 12 || accountNumberStr.charAt(0) == 0) {
                System.out.println("Enter Your Account Number Again: ");
                accountNumber = scanner.nextLong();
                accountNumberStr = String.valueOf(accountNumber);
            }
            userData.add(accountNumber);
            System.out.println("Enter The IFSC : ");
            IFSC = scanner.next();
            
            while(!IFSC.matches(IFSCPattern) || IFSC.length() != 11) {
                System.out.println("Enter The IFSC Again : ");
                IFSC = scanner.next();
            }
            userData.add(IFSC);
            
            System.out.println("-----");
            System.out.println("Enter Your Name : ");
            String name1 = scanner.next();
            System.out.println("Enter The Account Number : ");
            long accNumber = scanner.nextLong();
            System.out.println("Enter the IFSC : ");
            String IFSC1 = scanner.next();
            
            System.out.println("Enter the Option: \n1 --> Withdraw\n2 --> Deposit");
            int option = scanner.nextInt();

            while(!optionValidator(option)) {
                System.out.println("Enter the Option Again : \n1 --> Withdraw\n2 --> Deposit");
                option = scanner.nextInt();
            }
            
            
            
            if(userData.contains(name1) && userData.contains(accNumber) && userData.contains(IFSC1)) {
                if (option == 1) {
                    System.out.println("Enter The Amount to Withdraw : ");
                    double withdrawalAmount = scanner.nextInt();
                    existingBalance -= withdrawalAmount;
                    System.out.println("Current Balance : " + existingBalance);
                    System.out.println("Withdrawal : " + withdrawalAmount);
                } else if (option == 2) {
                    System.out.println("Enter The Amount to Deposit : ");
                    double depositAmount = scanner.nextInt();
                    existingBalance += depositAmount;
                    System.out.println("Current Balance : " + existingBalance);

                }
            }else {
                System.out.println("Invalid data");
            }
            
            for(Object obj : userData) {
                System.out.print(obj + " ");
            }

        }catch (InputMismatchException e) {
            System.err.println("Invalid Data!");
        }
    }
    
    public static boolean optionValidator(int num) {
        if(num == 1 || num == 2) {
            return true;
        }
        return false;
	}

}

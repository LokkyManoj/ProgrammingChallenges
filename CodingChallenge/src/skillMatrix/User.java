//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the Name:");
//		String name=scanner.nextLine();
//		String regexForName = "^[A-Za-z]{5}$";
//        Pattern pattern = Pattern.compile(regexForName);
//        Matcher matcher = pattern.matcher(name);
//        while (!matcher.matches()) {
//            System.out.println("Invalid UserName. The name must be exactly 5 alphabetic characters.");
//            name = scanner.nextLine();
//        }
//        
//       System.out.println("Enter the Account Number:");
//       String accountNumber=scanner.nextLine();
//       String regex1 = "^[1-9][0-9]{11}$";
//       Pattern pattern1 = Pattern.compile(regex1);
//       Matcher matcher1 = pattern1.matcher(accountNumber);
//       
//       while (!matcher1.matches()) {
//           System.out.println("Invalid Account Number. It must be exactly 12 digits and cannot start with 0.");
//           accountNumber = scanner.nextLine();
//       }
//       
//       System.out.println("Enter an IFSC:");
//       String IFSC=scanner.nextLine();
//       String regexForIFSC="^[A-Z]{4}+0+[0-9]{6}$";
//       Pattern pattern2 = Pattern.compile(regexForIFSC);
//       Matcher matcher2 = pattern2.matcher(IFSC);
//       while (!matcher2.matches()) {
//           System.out.println("Invalid IFSC code.");
//           IFSC = scanner.nextLine();
//       }
//       
//		System.out.println("Existing Balance is "+existingBalance);
//		System.out.println("1.Deposit"
//				+ "2.Withdrawal"+" 3.Exit");
//		System.out.println("Enter the choice");
//		int choice=scanner.nextInt();
//		switch(choice) {
//		case 1:
//			System.out.println("Enter the Deposit amount :");
//			Double deposit=scanner.nextDouble();
//			Double newAmount=existingBalance+deposit;
//			System.out.println("The Existing Balance is:"+newAmount);
//			break;
//			
//		case 2:
//		System.out.println("Enter the withdrawal amount:");
//		Double withDrawal=scanner.nextDouble();
//		Double balanceAmount=existingBalance-withDrawal;
//		System.out.println("After withdrawal ,the existing balance is :"+balanceAmount);
//		break;
//		
//		case 3:
//			System.exit(0);
//		
//	}
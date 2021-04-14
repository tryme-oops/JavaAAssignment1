package bankingBCT;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 Scanner myObj1 = new Scanner(System.in);
		 System.out.println("Enter Bank Account Number:");
	     int ban = myObj1.nextInt();
	     
	     System.out.println("Enter Account Holder Name : ");
	     String ach = myObj1.next();
	     
	     System.out.println("Enter Loan Amount: ");
	     float LA = myObj1.nextFloat();
	     
	     System.out.println("Enter Loan Tenure:");
	     float LT=myObj1.nextFloat();
	     
	    
	     System.out.println("Enter Bank Name: ");
	     String BN = myObj1.next();
	     
	     
	     System.out.println("enter Cibil Score: ");
	     float CS = myObj1.nextFloat();
	     
	     
	     if(CS>700) {
	    	 System.out.println("Eligible for loan");

	 		 	if(BN.equals("BOB")) {
	 		 		BOB s = new BOB(ban, ach, LA, LT, BN, CS);
	 		 		s.TotalPayable(LA, LT);
	 		 		s.MonthlyEmi();
	 		 		s.InterestPayable(LA);
	 		 		s.Display();
	 		 		}
	 		 	else if(BN.equals("SBI")) {
	 		 		SBI s = new SBI(ban, ach, LA, LT, BN, CS);
	 		 		s.TotalPayable(LA, LT);
	 		 		s.MonthlyEmi();
	 		 		s.InterestPayable(LA);
	 		 		s.Display();
	 		 		}
	 		 	else if(BN.equals("Citibank")) {
	 		 		Citibank s = new Citibank(ban, ach, LA, LT, BN, CS);
	 		 		s.TotalPayable(LA, LT);
	 		 		s.MonthlyEmi();
	 		 		s.InterestPayable(LA);
	 		 		s.Display();
	 		 		}
	 		 	else if(BN.equals("ICICI")) {
	 		 		ICICI s = new ICICI(ban, ach, LA, LT, BN, CS);
	 		 		s.TotalPayable(LA, LT);
	 		 		s.MonthlyEmi();
	 		 		s.InterestPayable(LA);
	 		 		s.Display();
	 		 	}
	     	}
	     else {
	    	 System.out.println("Not eligible for loan");
	     }
		 
		
	}
	
	

}

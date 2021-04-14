package bankingprob;

public class Citibank extends personal{

	
	float IR;
	float Months;
	float Total_Payable;
	float Monthly_EMI;
	float Interest_Payable;
	
	Citibank(int ban, String ach,float LA, float LT,String BN, float CS){
		this.bankAccountNumber =  ban;
		this.AccountHolderName = ach;
		this.LoanAmount = LA;
		this.Loantenure = LT;
		this.Bank_Name=BN;
		this.CIBILScore = CS;
		IR = (float) 6.75;
		Months = LT*12;
		}
		
		public void TotalPayable(float LA, float LT) {
		   
		    Total_Payable = LA+((LA*LT*IR)/100);
		    
		}
		    
		public void MonthlyEmi() {
			
			Monthly_EMI = Total_Payable/Months;
			
		}
		
		public void InterestPayable(float LA) { 
			
		    Interest_Payable = (Total_Payable - LA );
		    
		 }
		
		
		public void Display() {
			
			System.out.println("Monthly EMI: "+ Monthly_EMI);
			System.out.println("Interest Payable: "+ Interest_Payable);
			System.out.println("Total Payable: "+ Total_Payable);
			
		}
	
	

}

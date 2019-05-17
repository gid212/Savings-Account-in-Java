public class SavingsAccount {
	
	public static double annualInterestRate;
	double savingsBalance;


	public void calcMonthlyInterest() {
		double interest = annualInterestRate*savingsBalance/12.0;
		savingsBalance += interest;
	}

	public static void setInterestRate(double newRate) {
		annualInterestRate = newRate;
	}

	public void setSavingsBalance(double balance) {
		savingsBalance = balance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

}

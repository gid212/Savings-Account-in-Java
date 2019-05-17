public class main {
	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);

		saver1.setInterestRate(.04);
		System.out.printf("%-6s %-10s %-10s\n","Month","Saver1","Saver2");
		for(int i = 1; i<=13; i++) {
			if (i == 13) {
				saver1.setInterestRate(.05);
			}
			
			saver1.calcMonthlyInterest();
			saver2.calcMonthlyInterest();
			System.out.printf("%-6d %-10.2f %-10.2f\n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
		}

	}

}
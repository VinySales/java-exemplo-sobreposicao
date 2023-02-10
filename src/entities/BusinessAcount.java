package entities;

public class BusinessAcount extends Account{
	private Double loanLimit;
	
	public BusinessAcount() {
		super();
	}
	
	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		this.balance -= 2;
	}
}

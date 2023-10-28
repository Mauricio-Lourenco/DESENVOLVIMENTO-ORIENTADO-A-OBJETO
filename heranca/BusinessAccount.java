package heranca;

public class BusinessAccount extends Account {
	private Double loanLimit;

	public BusinessAccount() {
		super();

	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			deposit(amount - 10.0);
		}
	}
}

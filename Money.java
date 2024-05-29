class Money {
    private double amount;
	private String currency;

    public Money(double amount, String currency) {
        this.amount = amount;
		this.currency = currency;
    }
	
	// New constructor for double
	public Money(double amount) {
		this.amount = amount;
		this.currency = "USD"; // default currency
	}

	// New constructor for int
	public Money(int amount) {
		this.amount = amount;
		this.currency = "USD"; // default currency
	}


    // Copy constructor
    public Money(Money otherMoney) {
        this.amount = otherMoney.amount;
		this.currency = otherMoney.currency;
    }

	// Getters for amount and currency
    public double getAmount() {
        return amount;
    }
	public String getCurrency() {
		return currency;
	}

    public void add(Money otherMoney) {
        amount += otherMoney.amount;
    }

    public void subtract(Money otherMoney) {
        amount -= otherMoney.amount;
    }

    @Override
    public String toString() {
        return "$" + amount;
    }
}

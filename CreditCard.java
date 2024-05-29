// Purpose: This class defines a CreditCard object with an owner (Person), balance (Money), and credit limit (Money). It includes methods to charge the card, make a payment, and access information about the card and owner.
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;
	
	
	// Accessor method to get the credit limit (returns a new Money object)
	public Money getCreditLimit() {
		return creditLimit;
	}
    // Constructor with Person and Money parameters
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Create a new Money object using copy constructor
        this.balance = new Money(0); // Initialize balance to zero
    }


    // Accessor method to get the balance (returns a new Money object)
    public Money getBalance() {
        return new Money(balance); // Return a copy of the balance
    }

    // Accessor method to get available credit (returns a new Money object)
    public Money getAvailableCredit() {
        return new Money(creditLimit.getAmount() - balance.getAmount());
    }

    // Accessor method to get owner information as a String
    public String getOwnerInfo() {
        return owner.toString(); // Call toString method for the owner (Person)
    }



    // Method to charge the credit card
    public void charge(Money amount) {
        if (balance.getAmount() + amount.getAmount() <= creditLimit.getAmount()) {
            balance.add(amount); // Add the amount to the balance
        } else {
            System.out.println("Exceeds credit limit. ");
        }
    }

    // Method to make a payment on the credit card
    public void makePayment(Money amount) {
        balance.subtract(amount); // Subtract the amount from the balance
    }
}
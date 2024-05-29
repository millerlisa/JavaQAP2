public class TestMoney {

	public static void main (String[] args) {
		// Create an original Money object
		Money originalMoney = new Money(100.0, "USD");

		// Create a duplicate Money object using the copy constructor
		Money duplicateMoney = new Money(originalMoney);

		// Display the details of both objects
		System.out.println("Original Money: " + originalMoney.getAmount() + " " + originalMoney.getCurrency());
		System.out.println("Duplicate Money: " + duplicateMoney.getAmount() + " " + duplicateMoney.getCurrency());
	} 
}


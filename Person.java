public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
	public Person(String firstName, String lastName, Address address) {
		this.name = firstName + " " + lastName;
		this.address = address;
	}
	private Address address;
	public Address getAddress() {
		return address;
	}
	
	

    @Override
    public String toString() {
        return name;
    }
}

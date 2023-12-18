package contact;

public class Contact {
	private String conId;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String conId, String firstName, String lastName, String phoneNum,
			String address) {
		if (conId == null) {
			throw new IllegalArgumentException("Contact ID cannot be null.");
		} else if (conId.length() > 10) {
			throw new IllegalArgumentException("Contact ID cannot be longer than 10 characters.");
		} else {
			this.conId = conId;
		}
		
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be null.");
		} else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First name cannot be longer than 10 characters.");
		} else {
			this.firstName = firstName;
		}
		
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be null.");
		} else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last name cannot be longer than 10 characters.");
		} else {
			this.lastName = lastName;
		}
		
		if (phoneNum == null) {
			throw new IllegalArgumentException("Phone number cannot be null.");
		} else if (phoneNum.length() != 10) {
			throw new IllegalArgumentException("Phone number must have exactly 10 digits.");
		} else {
			this.phoneNum = phoneNum;
		}
		
		if (address == null) {
			throw new IllegalArgumentException("Address cannot be null.");
		} else if (address.length() > 30) {
			throw new IllegalArgumentException("Address cannot must be no longer than 30 characters.");
		} else {
			this.address = address;
		}
	}
	
	public String getConId() {
		return conId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}

package contact;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contactList = new ArrayList<>();
	
	public boolean addContact(Contact newContact) {
		for (Contact contact : contactList) {
			if (contact.equals(newContact)) {
				return contactList.add(contact);
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public boolean deleteContact(String currentId) {
		for (Contact contact : contactList) {
			if (contact.getConId().equals(currentId)) {
				return contactList.remove(contact);
			}
		}
		return false;
	}
	
	public boolean updateContact(String id, String firstName, String lastName, String phoneNum, String address) {
		for (Contact contact : contactList) {
			if (contact.getConId().equals(id)) {
				if (firstName != null && firstName.length() <= 10) {
					contact.setFirstName(firstName);
				}
				if (lastName != null && lastName.length() <= 10) {
					contact.setLastName(lastName);
				}
				if (phoneNum != null && phoneNum.length() == 10) {
					contact.setPhoneNum(phoneNum);
				}
				if (address != null && address.length() <= 30) {
					contact.setAddress(address);
				}
				return true;
			}
		}
		return false;
	}	
}
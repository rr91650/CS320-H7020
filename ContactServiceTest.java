package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

class ContactServiceTest {

	@Test
	void testAddContact() {
		Contact contact1 = new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		Contact contact2 = new Contact("2345678901", "Randal", "Ramire", "9164444444",
				"3 Basic Dr Sacramento CA");
		ContactService contactService = new ContactService();
		assertEquals(true, contactService.addContact(contact1));
		assertEquals(true, contactService.addContact(contact2));
	}
	
	@Test
	void testDeleteContact() {
		Contact contact1 = new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		Contact contact2 = new Contact("2345678901", "Randal", "Ramire", "9164444444",
				"3 Basic Dr Sacramento CA");
		ContactService contactService = new ContactService();
		assertEquals(true, contactService.addContact(contact1));
		assertEquals(true, contactService.addContact(contact2));
		assertEquals(true, contactService.deleteContact("1234567890"));
		assertEquals(true, contactService.deleteContact("2345678901"));
		assertTrue(contactService.deleteContact("1234567890"));
	}

	@Test
	void testUpdateContact() {
		Contact contact1 = new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		Contact contact2 = new Contact("2345678901", "Randal", "Ramire", "9164444444",
				"3 Basic Dr Sacramento CA");
		ContactService contactService = new ContactService();
		assertEquals(true, contactService.addContact(contact1));
		assertEquals(true, contactService.addContact(contact2));
		
		//update first name of first contact
		assertEquals(true, contactService.updateContact("1234567890", "Randy", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA"));
		assertEquals(contact1.getFirstName(), "Randy");
		
		//update last name of first contact
		assertEquals(true, contactService.updateContact("1234567890", "Randall", "Valino", "9165555555",
				"4 Basic Dr Sacramento CA"));
		assertEquals(contact1.getLastName(), "Valino");
		
		//update phone number and address of second contact
		assertEquals(true, contactService.updateContact("2345678901", "Randal", "Ramire", "9163333333",
				"2 Basic Dr Sacramento CA"));
		assertEquals(contact2.getPhoneNum(), "9163333333");
		assertEquals(contact2.getAddress(), "2 Basic Dr Sacramento CA");
		
		//update first and last name, phone number and address of first contact
		assertEquals(true, contactService.updateContact("1234567890", "Randy", "Valino", "9162222222",
				"1 Basic Dr Sacramento CA"));
		assertEquals(contact1.getFirstName(), "Randy");
		assertEquals(contact1.getLastName(), "Valino");
		assertEquals(contact1.getPhoneNum(), "9162222222");
		assertEquals(contact1.getAddress(), "1 Basic Dr Sacramento CA");
	}
}

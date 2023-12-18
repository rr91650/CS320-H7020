package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contact.Contact;


class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		assertTrue(contact.getConId().equals("1234567890"));
		assertTrue(contact.getFirstName().equals("Randall"));
		assertTrue(contact.getLastName().equals("Ramirez"));
		assertTrue(contact.getPhoneNum().equals("9165555555"));
		assertTrue(contact.getAddress().equals("4 Basic Dr Sacramento CA"));		
	}
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890123456", "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Randall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "RandallRandall", "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Ramirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", "RamirezRamirez", "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", null, "9165555555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactPhoneNumNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", "Ramirez", "916555",
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactPhoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", "Ramirez", null,
				"4 Basic Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				"4444444444 Not A BasicAddress Dr Sacramento CA");
		});
	}
	
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Randall", "Ramirez", "9165555555",
				null);
		});
	}

}

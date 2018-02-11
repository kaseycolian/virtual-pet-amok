package VirtualPetsAmokTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat underTest = new OrganicCat ("1234", "Tank", "bat");

	@Test
	public void shouldDisplayNameOfPet() {
		String check = underTest.getPetName();
		assertEquals(check, "Tank");
	}

	@Test
	public void shouldDisplayTypeOfPet() {
		String check = underTest.getTypeOfPet();
		assertEquals(check, "bat");
	}

	@Test
	public void shouldDisplayMicrochipNumber() {
		String check = underTest.getMicrochipNumber();
		assertEquals(check, "1234");

	}
	@Test
	public void shouldReturnDefaultBoredomLevel() {
		int check = underTest.getBoredomLevel();
		assertEquals(check, (10));
	}
	
	@Test
	public void shouldReturnDefaultHappyLevel() {
		int check = underTest.getHappyLevel();
		assertEquals(check, (50));
		
	}
	
}

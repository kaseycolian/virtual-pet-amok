package VirtualPetsAmokTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {

	OrganicDog underTest = new OrganicDog("1111", "Fido", "Mutt");

	@Test
	public void shouldDisplayNameOfPet() {
		String check = underTest.getPetName();
		assertEquals(check, "Fido");
	}

	@Test
	public void shouldDisplayTypeOfPet() {
		String check = underTest.getTypeOfPet();
		assertEquals(check, "Mutt");
	}

	@Test
	public void shouldDisplayMicrochipNumber() {
		String check = underTest.getMicrochipNumber();
		assertEquals(check, "1111");

	}

	@Test
	public void shouldHaveBoredomGoDownWhenWalking() {
		int boredomBefore = underTest.getBoredomLevel();
		underTest.goForAWalk();
		int boredomAfter = underTest.getBoredomLevel();
		assertThat(boredomAfter - boredomBefore, is(-5));

	}
	
	@Test
	public void shouldShowWasteLevel() {
		int check = underTest.getNeedToWasteLevel();
		assertEquals(check, 15);
		
	}
	@Test
	public void shouldHaveNeedToWasteGoDownWhileWalking(){
	int needToGoBefore = underTest.getNeedToWasteLevel();
	underTest.goForAWalk();
	int needToGoAfter = underTest.getNeedToWasteLevel();
	assertThat(needToGoBefore - needToGoAfter, is(7));
	}
}
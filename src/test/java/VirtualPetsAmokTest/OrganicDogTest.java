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

	@Test // also testing access to boredomLevel & needToWasteLevel
	public void shouldEffect2LevelsWhenWalking() {
		int boredomBefore = underTest.getBoredomLevel();
		int needToGoBefore = underTest.getNeedToWasteLevel();
		underTest.goForAWalk();
		int boredomAfter = underTest.getBoredomLevel();
		int needToGoAfter = underTest.getNeedToWasteLevel();
		assertThat(boredomAfter - boredomBefore, is(-5));
		assertThat(needToGoBefore - needToGoAfter, is(7));

	}	
	@Test //also testing access to hungerLevel, thirstLevel, & happyLevel
	public void shouldEffect4LevelsWithPlay() {
		int hungerBefore = underTest.getHungerLevel();
		int thirstBefore = underTest.getThirstLevel();
		int boredomBefore = underTest.getBoredomLevel();
		int happyBefore = underTest.getHappyLevel();

		underTest.playWithPet();
		
		int hungerAfter = underTest.getHungerLevel();
		int thirstAfter = underTest.getThirstLevel();
		int boredomAfter = underTest.getBoredomLevel();
		int happyAfter = underTest.getHappyLevel();
		
		assertThat(boredomBefore - boredomAfter, is(10));
		assertThat(hungerAfter - hungerBefore, is (3));
		assertThat(thirstAfter - thirstBefore, is (3));
		assertThat(happyBefore - happyAfter, is (10));
	}
}
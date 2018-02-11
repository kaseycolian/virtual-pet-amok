package VirtualPetsAmokTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {

	OrganicCat underTest = new OrganicCat("1234", "Tank", "bat");

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
	public void tickShouldEffectEachLevel() {
		int hungerBefore = underTest.getHungerLevel();
		int thirstBefore = underTest.getThirstLevel();
		int magicBefore = underTest.getMagicLevel();
		int boredomBefore = underTest.getBoredomLevel();
		int healthBefore = underTest.getHealthLevel();
		int happyBefore = underTest.getHappyLevel();
		underTest.tickEffectOne();
		int hungerAfter = underTest.getHungerLevel();
		int thirstAfter = underTest.getThirstLevel();
		int magicAfter = underTest.getMagicLevel();
		int boredomAfter = underTest.getBoredomLevel();
		int healthAfter = underTest.getHealthLevel();
		int happyAfter = underTest.getHappyLevel();

		assertThat(hungerAfter - hungerBefore, is(3));
		assertThat(thirstAfter - thirstBefore, is(3));
		assertThat(magicAfter - magicBefore, is(3));
		assertThat(boredomAfter - boredomBefore, is(3));
		assertThat(healthBefore - healthAfter, is(3));
		assertThat(happyBefore - happyAfter, is(3));

	}

}

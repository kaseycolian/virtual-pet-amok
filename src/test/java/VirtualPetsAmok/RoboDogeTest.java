package VirtualPetsAmok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

//import VirtualPetsAmok.RoboDragon;

public class RoboDogeTest {
	RoboDragon underTest = new RoboDragon("2222", "Fidobot", "BotBot");

	@Test
	public void shouldReturnNameOfRoboDog() {
		String check = underTest.getPetName();
		assertEquals(check, "Fidobot");

	}

	@Test
	public void shouldReturnMicrochipNumber() {
		String check = underTest.getMicrochipNumber();
		assertEquals(check, "2222");
	}

	@Test
	public void shouldReturnAnimalType() {
		String check = underTest.getTypeOfPet();
		assertEquals(check, "BotBot");
	}

	@Test // Also passed test when total amount was over 100 to only return 100.
	public void shouldOilPet() {
		int oilBefore = underTest.getOilLevel();
		underTest.oilRoboPet();
		int oilAfter = underTest.getOilLevel();
		assertThat(oilAfter - oilBefore, is(15));
	}

	@Test
	public void shouldEffectAllLevelsForTick() {
		int healthLevelBefore = underTest.getHealthLevel();
		int magicLevelBefore = underTest.getMagicLevel();
		int boredomLevelBefore = underTest.getBoredomLevel();
		int happyLevelBefore = underTest.getHappyLevel();
		int oilLevelBefore = underTest.getOilLevel();
		underTest.tickEffectOne();
		int healthAfter = underTest.getHealthLevel();
		int magicAfter = underTest.getMagicLevel();
		int boredomAfter = underTest.getBoredomLevel();
		int happyLevelAfter = underTest.getHappyLevel();
		int oilLevelAfter = underTest.getOilLevel();

		assertThat(healthLevelBefore - healthAfter, is(3));
		assertThat(magicAfter - magicLevelBefore, is(3));
		assertThat(boredomAfter - boredomLevelBefore, is(3));
		assertThat(happyLevelBefore - happyLevelAfter, is(3));
		assertThat(oilLevelBefore - oilLevelAfter, is(5));
	}

}
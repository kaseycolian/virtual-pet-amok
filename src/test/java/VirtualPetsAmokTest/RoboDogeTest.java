package VirtualPetsAmokTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboDogeTest {
	RoboDog underTest = new RoboDog("2222", "Fidobot", "BotBot", false);

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

	@Test
	public void shouldBeOilable() {
		Boolean isOilable = underTest.getOilableStatus();
		assertThat(isOilable, is(false));
	}

	@Test
	public void shouldReturnOilLevel() {
		int check = underTest.getOilLevel();
		assertThat(check, is(50));
	}

	@Test
	public void shouldReturnHappyLevel() {
		int check = underTest.getHappyLevel();
		assertThat(check, is(50));
	}
	
	@Test
	public void shouldOilPet() {
		int oilBefore = underTest.getOilLevel();
		underTest.oilRoboPet();
		int oilAfter = underTest.getOilLevel();
		assertThat(oilAfter - oilBefore, is (15));
	}

	@Test
	public void shouldEffect3LevelsForTick() {
		int healthLevelBefore = underTest.getHealthLevel();
		int magicLevelBefore = underTest.getMagicLevel();
		int boredomLevelBefore = underTest.getBoredomLevel();
		underTest.tickEffectOne();
		int healthAfter = underTest.getHealthLevel();
		int magicAfter = underTest.getMagicLevel();
		int boredomAfter = underTest.getBoredomLevel();
		assertThat(healthLevelBefore - healthAfter, is(3));
		assertThat(magicAfter - magicLevelBefore, is(3));
		assertThat(boredomAfter - boredomLevelBefore, is(3));
	}

}
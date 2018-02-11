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
		assertThat(isOilable, is (false));
	}
	
	@Test public void shouldReturnOilLevel() {
		int check = underTest.getOilLevel();
		assertThat(check, is(50));
	}
	
	@Test 
	public void shouldReturnHealthLevel() {
	int check = underTest.getHealthLevel();
	assertThat(check, is (80));
	}
	
	@Test
	public void shouldReturnHappyLevel() {
		int check = underTest.getHappyLevel();
		assertThat (check, is (50));
	}
	
	@Test
	public void shouldReturnBoredeomLevel() {
		int check = underTest.getBoredomLevel();
		assertThat (check, is (10));
	}

	@Test
	public void shouldReturnMagicLevel() {
		int check = underTest.getMagicLevel();
		assertThat (check, is (50));
	}
	
}

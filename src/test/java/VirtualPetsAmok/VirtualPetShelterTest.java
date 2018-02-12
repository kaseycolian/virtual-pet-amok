package VirtualPetsAmok;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

import VirtualPet.VirtualPet;

public class VirtualPetShelterTest {

	Creatures animalDemo = new RoboDragon("1234", "chubs", "");
	OrganicDragon animalRealDemo = new OrganicDragon("4444", "tank", "");
	Creatures animalRealPho = new OrganicPhoenix("5555", "cat", "");

	@Test
	public void shouldAddOneRoboDragon() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addAnimal(animalDemo.getMicrochipNumber(), animalDemo);
		assertThat(animalDemo.getMicrochipNumber(), is("1234"));
	}

	@Test
	public void shouldAddOneOrganicDragon() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addAnimal(animalRealDemo.getMicrochipNumber(), animalRealDemo);
		assertThat(animalRealDemo.getMicrochipNumber(), is("4444"));
	}

	@Test
	public void shouldPlayWithOne() {
		Creatures underTest = new RoboDragon("tank", "", "");
		String nameOfPet = animalDemo.getPetName();
		int boredomBefore = animalDemo.getBoredomLevel();
		underTest.playWithPet();
		int boredomLevelAft = animalDemo.getBoredomLevel();
		assertThat(boredomBefore - boredomLevelAft, is(50));

	}
	// @Test
	// public void shouldFeedAll() {
	// VirtualPetShelter underTest = new VirtualPetShelter();
	// Creatures lairApp = new OrganicDragon ("", "", "");
	// int hungerAfter = animalRealDemo.getHungerLevel();
	// underTest.feedAll(lairApp);
	// int hungerAfters = animalRealDemo.getHungerLevel();
	// assertThat(hungerAfters, (is(4)));
	// }

}

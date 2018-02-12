package VirtualPetsAmok;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest = new VirtualPetShelter();

	@Test
	public void shouldAddOneRoboDragon() {
		Creatures roboDragon = new RoboDragon("1234", "chubs", "");
		underTest.addAnimal(roboDragon.getMicrochipNumber(), roboDragon);
		assertThat(roboDragon.getMicrochipNumber(), is("1234"));
	}

	@Test
	public void shouldAddOneOrganicDragon() {
		OrganicDragon organicDragon = new OrganicDragon("4444", "tank", "");
		underTest.addAnimal(organicDragon.getMicrochipNumber(), organicDragon);
		assertThat(organicDragon.getMicrochipNumber(), is("4444"));
	}

	@Test
	public void shouldPlayWithOne() {
		underTest.addYourOwnRoboDragon("5432", "tank", "cat");
		RoboDragon robo = (RoboDragon) underTest.animals.get("5432");
		int boredomBefore = robo.getBoredomLevel();
		underTest.playWithPet("5432");
		int boredomLevelAft = robo.getBoredomLevel();
		assertThat(boredomBefore - boredomLevelAft, is(10));
	}

	@Test
	public void shouldFeedAll() {
		underTest.addYourOwnOrganicDragon("5454", "chairman", "monster");
		OrganicDragon dragon = (OrganicDragon) underTest.animals.get("5454");
		int hungerBefore = dragon.getHungerLevel();
		underTest.feedAll();
		int hungerAfter = dragon.getHungerLevel();
		assertThat(hungerBefore - hungerAfter, is(10));
	}

	@Test
	public void shouldWaterAll() {
		underTest.addYourOwnOrganicDragon("5454", "chairman", "monster");
		OrganicDragon dragon = (OrganicDragon) underTest.animals.get("5454");
		int thirstBefore = dragon.getThirstLevel();
		underTest.waterAll();
		int thirstAfter = dragon.getThirstLevel();
		assertThat(thirstBefore - thirstAfter, is(10));
	}

	@Test
	public void shouldWalkDragons() {
		underTest.addYourOwnOrganicDragon("5454", "chairman", "monster");
		OrganicDragon dragon = (OrganicDragon) underTest.animals.get("5454");
		int boredomBefore = dragon.getBoredomLevel();
		underTest.walkAllDogs();
		int boredomAfter = dragon.getBoredomLevel();
		assertThat(boredomBefore - boredomAfter, is(5));
	}

	@Test
	public void shouldOilRobots() {
		underTest.addYourOwnRoboDragon("4321", "chubs", "cougar");
		RoboDragon roboDragon = (RoboDragon) underTest.animals.get("4321");
		int oilBefore = roboDragon.getOilLevel();
		underTest.oilAllRobots();
		int oilAfter = roboDragon.getOilLevel();
		assertThat(oilAfter - oilBefore, is(15));
	}

	@Test
	public void shouldReduceDragonDiryCageLevel() {
		underTest.addYourOwnOrganicDragon("5454", "chairman", "monster");
		OrganicDragon dragon = (OrganicDragon) underTest.animals.get("5454");
		int dirtyBefore = dragon.getSoiledAreaLevel();
		underTest.cleanAllDogCages();
		int dirtyAfter = dragon.getSoiledAreaLevel();
		assertThat(dirtyBefore - dirtyAfter, is(5));

	}

	@Test
	public void shouldEmptyLitterBox() {
		underTest.addYourOwnOrganicPhoenix("2222", "dozer", "bird");
		underTest.tickAll();
		int dirtyBefore = underTest.getLitterBoxLeveL();
		underTest.litterBoxEmpty();
		int dirtyAfter = underTest.getLitterBoxLeveL();
		assertThat(dirtyBefore - dirtyAfter, is(25));
	}
}
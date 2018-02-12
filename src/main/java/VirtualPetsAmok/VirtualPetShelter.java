package VirtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	static final int DEFAULT_LITTERBOXLEVEL = 5;
	private int litterBoxLevel = DEFAULT_LITTERBOXLEVEL;

	Map<String, Pets> animals = new HashMap<>();
	public Set<String> microchipNumber = animals.keySet();

	public void addAnimal(String microchipNumber, Pets animal) {
		animals.put(animal.getMicrochipNumber(), animal);
	}

	public void addYourOwnOrganicDog(String microchipNumber, String name, String type) {
		Pets userAdded = new OrganicDog(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}

	}

	public void addYourOwnOrganicCat(String microchipNumber, String name, String type) {
		Pets userAdded = new OrganicCat(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public void addYourOwnRoboDog(String microchipNumber, String name, String type) {
		Pets userAdded = new RoboDog(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public Collection<Pets> animalsss() {
		Collection<Pets> allPetInfo = animals.values();
		return allPetInfo;
	}

	public void feedAll() {
		for (Pets pet : animals.values()) {
			if (pet instanceof OrganicPetsAbilities) {
				((OrganicPetsAbilities) pet).feedOne();
			}
		}
		System.out.println("Thank you for the delicious critters. We will need the energy for future journeys!");
	}

	public void waterAll() {
		for (Pets pet : animals.values()) {
			if (pet instanceof OrganicPetsAbilities) {
				((OrganicPetsAbilities) pet).waterOne();
			}
		}
		System.out.println("Thank you for taking us.  The Pool of Elven Tears helps restore our magical powers.");
	}

	public void walkAllDogs() {
		for (Pets pet : animals.values()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).goForAWalk();
			}
		}
		System.out.println("Thank you for taking creatures of The Lair for a walk!");

	}

	public void oilAllRobots() {
		for (Pets pet : animals.values()) {
			if (pet instanceof RoboDog) {
				((RoboDog) pet).oilRoboPet();
			}
		}
		System.out.println("Thank you for keeping the robotic creatures oiled and happy!");
	}

	public void cleanAllDogCages() {
		for (Pets pet : animals.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
		System.out.println("Thank you for cleaning each dragon cage!");
	}

	public void tickAll() {
		for (Pets pet : animals.values()) {
			pet.tickEffectOne();
		}
		litterBoxLevel = litterBoxLevel + 10;
		for (Pets pet : animals.values()) {
			if (litterBoxLevel > 60 && pet instanceof OrganicCat) {
				((OrganicCat) pet).makeSad();
			}
		}
	}

	public void litterBoxEmpty() {
		litterBoxLevel = 0;
		for (Pets pet : animals.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).makeHappy();
			}
		}
		System.out.println("Thanks for ");
	}

	public void fireAll() {
		for (Pets petToFire : animals.values()) {
			petToFire.fireOne();
		}
		System.out.println("Thanks! We are only allowed to release our magic under supervision per The Lair contract.");
	}

	// public void playWithPet() {
	// for (Pets petToPlay: animals.containsKey(petToPlay))
	// }

	public void returnStatusOfAll() {
		System.out.println();
		System.out.println("The Lair litter box level: " + litterBoxLevel);
		System.out.println();
		for (Pets petToDisplay : animals.values()) {
			if (petToDisplay instanceof OrganicDog) {
				System.out.println(petToDisplay.toString());
				// System.out.println(petToDisplay.getPetName() + " the " +
				// petToDisplay.getTypeOfPet()
				// + "\n\tHealth Level: " + ((OrganicDog) petToDisplay).getHealthLevel() + " |
				// Happiness Level: "
				// + ((OrganicDog) petToDisplay).getHappyLevel() + "\n\tHunger Level: "
				// + ((OrganicDog) petToDisplay).getHungerLevel() + " | Thirst Level: "
				// + ((OrganicDog) petToDisplay).getThirstLevel() + "\n\tFire Level: "
				// + petToDisplay.getMagicLevel() + " | Boredom Level: " +
				// petToDisplay.getBoredomLevel()
				// + "\n\tNeed To Waste Level: " + ((OrganicDog)
				// petToDisplay).getNeedToWasteLevel()
				// + "\n\tCage Filth Level: " + ((OrganicDog)
				// petToDisplay).getSoiledAreaLevel());
			}
			if (petToDisplay instanceof OrganicCat) {
				System.out.println(petToDisplay.toString());
				// System.out.println(petToDisplay.getPetName() + " the " +
				// petToDisplay.getTypeOfPet()
				// + "\n\tHealth Level: " + ((OrganicCat) petToDisplay).getHealthLevel() + " |
				// Happiness Level: "
				// + ((OrganicCat) petToDisplay).getHappyLevel() + "\n\tHunger Level: "
				// + ((OrganicCat) petToDisplay).getHungerLevel() + " | Thirst Level: "
				// + ((OrganicCat) petToDisplay).getThirstLevel() + "\n\tFire Level: "
				// + petToDisplay.getMagicLevel() + " | Boredom Level: " +
				// petToDisplay.getBoredomLevel());
			}
			if (petToDisplay instanceof RoboDog) {
				System.out.println(petToDisplay.toString());
				// System.out.println(petToDisplay.getPetName() + " the " +
				// petToDisplay.getTypeOfPet()
				// + "\n\tHealth Level: " + ((RoboDog) petToDisplay).getHealthLevel() + " |
				// Happiness Level: "
				// + ((RoboDog) petToDisplay).getHappyLevel() + "\n\tFire Level: " +
				// petToDisplay.getMagicLevel()
				// + " | Boredom Level: " + petToDisplay.getBoredomLevel() + "\n\tOil Level: "
				// + ((RoboDog) petToDisplay).getOilLevel());
			}
		}
	}
}

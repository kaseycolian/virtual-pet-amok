package VirtualPetsAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Set;

public class VirtualPetShelter {

	static final int DEFAULT_LITTERBOXLEVEL = ThreadLocalRandom.current().nextInt(0, 20);
	private int litterBoxLevel = DEFAULT_LITTERBOXLEVEL;

	public Map<String, Creatures> animals = new HashMap<>();
	public Set<String> microchipNumber = animals.keySet();

	public void addAnimal(String microchipNumber, Creatures animal) {
		animals.put(animal.getMicrochipNumber(), animal);
	}

	public void addYourOwnOrganicDragon(String microchipNumber, String name, String type) {
		Creatures userAdded = new OrganicDragon(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}

	}

	public void addYourOwnOrganicPhoenix(String microchipNumber, String name, String type) {
		Creatures userAdded = new OrganicPhoenix(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public void addYourOwnRoboDragon(String microchipNumber, String name, String type) {
		Creatures userAdded = new RoboDragon(microchipNumber, name, type);
		if (animals.containsKey(microchipNumber)) {
			System.out.println(
					"\nThe Lair is too exclusive for duplicate microchips!  Please create a microchip number that's not yet taken.");
		} else {
			this.addAnimal(microchipNumber, userAdded);
			System.out.println(name + " the " + type + " is now residing at The Lair!");
		}
	}

	public Collection<Creatures> animalsss() {
		Collection<Creatures> allPetInfo = animals.values();
		return allPetInfo;
	}

	public void feedAll() {
		for (Creatures pet : animals.values()) {
			if (pet instanceof OrganicPetsAbilities) {
				((OrganicPetsAbilities) pet).feedOne();
			}
		}
		System.out.println("Thank you for the delicious critters. We will need the energy for future journeys!");
	}

	public void waterAll() {
		for (Creatures pet : animals.values()) {
			if (pet instanceof OrganicPetsAbilities) {
				((OrganicPetsAbilities) pet).waterOne();
			}
		}
		System.out.println("Thank you for taking us.  The Pool of Elven Tears helps restore our magical powers.");
	}

	public void walkAllDogs() {
		for (Creatures pet : animals.values()) {
			if (pet instanceof Walkable) {
				((Walkable) pet).goForAWalk();
			}
		}
		System.out.println("Thank you for taking creatures of The Lair for a walk!");

	}

	public void playWithOne() {

	}

	public void showAllNumbsNamesAndTypes() {
		for (Creatures pet : animals.values()) {
			System.out.println(pet.getMicrochipNumber() + " " + pet.getPetName() + " the " + pet.getTypeOfPet());
		}
	}

	public void playWithPet(String microchipNumber) {
		Creatures petToPlay = animals.get(microchipNumber);
		petToPlay.playWithPet();
	}

	public void adopt(String numberOfPetToAdopt) {
		Creatures petToAdopt = animals.get(numberOfPetToAdopt);
		animals.remove(numberOfPetToAdopt);
		System.out.println(petToAdopt.getPetName()
				+ " is off on its journey to its new lands! Thank you finding new castlelands for "
				+ petToAdopt.getPetName() + " to call home!");

	}

	public void oilAllRobots() {
		for (Creatures pet : animals.values()) {
			if (pet instanceof RoboDragon) {
				((RoboDragon) pet).oilRoboPet();
			}
		}
		System.out.println("Thank you for keeping the robotic creatures oiled and happy!");
	}

	public void cleanAllDogCages() {
		for (Creatures pet : animals.values()) {
			if (pet instanceof OrganicDragon) {
				((OrganicDragon) pet).cleanCage();
			}
		}
		System.out.println("Thank you for cleaning each dragon cage!");
	}

	public void tickAll() {
		for (Creatures pet : animals.values()) {
			pet.tickEffectOne();
		}
		litterBoxLevel = litterBoxLevel + 10;
		for (Creatures pet : animals.values()) {
			if (litterBoxLevel > 60 && pet instanceof OrganicPhoenix) {
				((OrganicPhoenix) pet).makeSad();
			}
		}
	}

	public int getLitterBoxLeveL() {

		return litterBoxLevel;
	}

	public void litterBoxEmpty() {
		litterBoxLevel = 0;
		for (Creatures pet : animals.values()) {
			if (pet instanceof OrganicPhoenix) {
				((OrganicPhoenix) pet).makeHappy();
			}
		}
		System.out.println("Thanks for cleaning the box!  We all feel healthier and probably smell better too!");
	}

	public void fireAll() {
		for (Creatures petToFire : animals.values()) {
			petToFire.fireOne();
		}
		System.out.println("Thanks! We are only allowed to release our magic under supervision per The Lair contract.");
	}

	public void returnStatusOfAll() {
		System.out.println();
		System.out.println("The Lair litter box level: " + litterBoxLevel);
		System.out.println();
		for (Creatures petToDisplay : animals.values()) {
			if (petToDisplay instanceof OrganicDragon) {
				System.out.println(petToDisplay.toString());
			}
			if (petToDisplay instanceof OrganicPhoenix) {
				System.out.println(petToDisplay.toString());
			}
			if (petToDisplay instanceof RoboDragon) {
				System.out.println(petToDisplay.toString());
			}
		}
	}
}

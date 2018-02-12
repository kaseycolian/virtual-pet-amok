package VirtualPetsAmok;

import java.util.concurrent.ThreadLocalRandom;

public class OrganicPhoenix extends Creatures implements OrganicPetsAbilities {
	// inherited playWithPet method and method body, did not need to override.

	static final int DEFAULT_HUNGERLEVEL = ThreadLocalRandom.current().nextInt(15, 55);
	static final int DEFAULT_THIRSTLEVEL = ThreadLocalRandom.current().nextInt(15, 45);

	private int hungerLevel = DEFAULT_HUNGERLEVEL;
	private int thirstLevel = DEFAULT_THIRSTLEVEL;

	public OrganicPhoenix(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	@Override
	public int getHungerLevel() {
		return hungerLevel;
	}

	@Override
	public int getThirstLevel() {
		return thirstLevel;
	}

	@Override
	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		happyLevel = happyLevel + 10;
		magicLevel = magicLevel - 5;
		healthLevel = healthLevel + 8;
		hungerLevel = hungerLevel + 5;
		thirstLevel = thirstLevel + 5;
		if (boredomLevel < 0) {
			boredomLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (magicLevel < 0) {
			magicLevel = 0;
		}

	}

	@Override
	public void feedOne() {
		hungerLevel = hungerLevel - 10;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 4;
		happyLevel = happyLevel + 5;
		if (hungerLevel < 0) {
			hungerLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}

	}

	public void makeSad() {
		happyLevel = happyLevel - 10;
	}

	public void makeHappy() {
		happyLevel = happyLevel + 15;
		{
			if (happyLevel > 100)
				happyLevel = 100;
		}
	}

	@Override
	public void waterOne() {
		thirstLevel = thirstLevel - 10;
		hungerLevel = hungerLevel + 3;
		magicLevel = magicLevel + 3;
		healthLevel = healthLevel + 3;
		happyLevel = happyLevel + 2;
		if (thirstLevel < 0) {
			thirstLevel = 0;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
	}

	@Override
	public void fireOne() {
		magicLevel = magicLevel - 10;
		hungerLevel = hungerLevel + 5;
		thirstLevel = thirstLevel + 3;
		healthLevel = healthLevel + 4;
		boredomLevel = boredomLevel - 5;
		happyLevel = happyLevel + 5;
		if (magicLevel < 0) {
			magicLevel = 0;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
		if (boredomLevel < 0) {
			boredomLevel = 0;
		}
		if (happyLevel > 100) {
			happyLevel = 100;
		}
	}

	@Override
	public void tickEffectOne() {
		hungerLevel = hungerLevel + 3;
		thirstLevel = thirstLevel + 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 6;
		healthLevel = healthLevel - 3;
		happyLevel = happyLevel - 3;
	}

	@Override
	public String toString() {
		return "The current levels for " + nameOfPet + " the " + typeOfPet + " are:" + "\n\tHealth Level: "
				+ healthLevel + "  |  Happiness Level: " + happyLevel + "\n\tHunger Level: " + hungerLevel
				+ "  | Thirst Level: " + thirstLevel + "\n\tFire Level: " + magicLevel;

	}
}

package VirtualPetsAmok;

public class OrganicCat extends Pets implements OrganicPetsAbilities {

	static final int DEFAULT_HUNGERLEVEL = 50;
	static final int DEFAULT_THIRSTLEVEL = 50;

	private int hungerLevel = DEFAULT_HUNGERLEVEL;
	private int thirstLevel = DEFAULT_THIRSTLEVEL;

	public OrganicCat(String microchipNumber, String nameOfPet, String typeOfPet) {
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
		if (magicLevel < 0) {
			magicLevel = 0;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
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

package VirtualPetsAmok;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Creatures {
	protected String microchipNumber;
	protected String nameOfPet;
	protected String typeOfPet;
	static final int DEFAULT_BOREDOMLEVEL = ThreadLocalRandom.current().nextInt(25, 60); // had set to non-random
																							// numbers for testing
	static final int DEFAULT_HAPPYLEVEL = ThreadLocalRandom.current().nextInt(40, 65);
	static final int DEFAULT_HEALTHLEVEL = ThreadLocalRandom.current().nextInt(70, 95);
	static final int DEFAULT_MAGICLEVEL = ThreadLocalRandom.current().nextInt(10, 50);
	protected int healthLevel = DEFAULT_HEALTHLEVEL;
	protected int happyLevel = DEFAULT_HAPPYLEVEL;
	protected int magicLevel = DEFAULT_MAGICLEVEL;
	protected int boredomLevel = DEFAULT_BOREDOMLEVEL;

	public Creatures(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	public Creatures() {
		super();
	}

	public String getPetName() {

		return nameOfPet;
	}

	public String getTypeOfPet() {

		return typeOfPet;
	}

	public String getMicrochipNumber() {
		return microchipNumber;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getMagicLevel() {
		return magicLevel;
	}

	public int getHappyLevel() {
		return happyLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void playWithPet() {

	}

	public void fireOne() {
	}

	public void tickEffectOne() {
	}

}
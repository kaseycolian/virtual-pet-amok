package VirtualPetsAmok;

public abstract class Pets {
	protected String microchipNumber;
	protected String nameOfPet;
	protected String typeOfPet;
	static final int DEFAULT_BOREDOMLEVEL = 10;
	static final int DEFAULT_HAPPYLEVEL = 50;
	static final int DEFAULT_HEALTHLEVEL = 80;
	static final int DEFAULT_MAGICLEVEL = 50;
	protected int healthLevel = DEFAULT_HEALTHLEVEL;
	protected int happyLevel = DEFAULT_HAPPYLEVEL;
	protected int magicLevel = DEFAULT_MAGICLEVEL;
	protected int boredomLevel = DEFAULT_BOREDOMLEVEL;

	public Pets(String microchipNumber, String nameOfPet, String typeOfPet) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
	}

	public Pets() {
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

	// will need to override to customize for organic pets and robot pets.
	public void playWithPet() {
		boredomLevel = boredomLevel - 10;
		happyLevel = happyLevel + 10;
		magicLevel = magicLevel - 5;
		healthLevel = healthLevel + 8;
		if (boredomLevel - 10 <= 10) {
			boredomLevel = 0;
		}
		if (happyLevel + 3 > 100) {
			happyLevel = 100;
		}
	}

	public void tickEffectOne() {
		healthLevel = healthLevel - 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;

	}
}
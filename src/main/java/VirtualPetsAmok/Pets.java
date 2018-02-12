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

	public void playWithPet() {

	}

	public void fireOne() {
	}

	public void tickEffectOne() {
	}

}
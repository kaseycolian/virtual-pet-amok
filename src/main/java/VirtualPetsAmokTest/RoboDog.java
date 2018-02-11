package VirtualPetsAmokTest;

public class RoboDog extends Pets implements Walkable {
	// has TickForOne inherited, no need to override.
	static final int DEFAULT_OILLEVEL = 50;

	private int oilLevel = DEFAULT_OILLEVEL;
	private Boolean isOilable;

	public Boolean getOilableStatus() {
		return isOilable;
	}

	public RoboDog(String microchipNumber, String nameOfPet, String typeOfPet, Boolean isOilable) {
		this.microchipNumber = microchipNumber;
		this.nameOfPet = nameOfPet;
		this.typeOfPet = typeOfPet;
		this.isOilable = isOilable;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void oilRoboPet() {
		oilLevel = oilLevel + 15;
		if (oilLevel > 100) {
			oilLevel = 100;
		}
	}

	@Override
	public void goForAWalk() {
		boredomLevel = boredomLevel - 7;
		happyLevel = happyLevel + 10;
		healthLevel = healthLevel + 8;
		oilLevel = oilLevel - 6;
		if (happyLevel > 100) {
			happyLevel = 100;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
	}

	@Override
	public void tickEffectOne() {
		healthLevel = healthLevel - 3;
		magicLevel = magicLevel + 3;
		boredomLevel = boredomLevel + 3;
		oilLevel = oilLevel - 5;
		happyLevel = happyLevel - 3;
	}

	public String getAllLevelsForIndividual() {
		return "The current levels for " + nameOfPet + " are:\nHealth Level: " + healthLevel + "\nMagic Level:  "
				+ magicLevel + "\nBoredom Level: " + boredomLevel + "\nOil Level: " + oilLevel;
	}

}
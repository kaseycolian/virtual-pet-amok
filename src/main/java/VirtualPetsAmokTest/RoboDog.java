package VirtualPetsAmokTest;

public class RoboDog extends Pets implements Walkable {
//has TickForOne inherited, no need to override.
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
	}

	@Override
	public void goForAWalk() {
		boredomLevel = boredomLevel - 7;
		happyLevel = happyLevel + 10;
		healthLevel = healthLevel + 8;
		
		
	}

}
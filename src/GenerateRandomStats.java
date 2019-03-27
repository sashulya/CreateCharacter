import java.util.Random;

public class GenerateRandomStats {
	private int Strength;
	private int Dexterity;
	private int Constitution;
	private int Intelligence;
	private int Wisdom;
	private int Charisma;
	final static Random random = new Random();
	
	public GenerateRandomStats(int bound) {
		switch(random.nextInt(bound)) {
			case 0:
				generate_standard();
		}
		
	}
	public int getStrength() {	return Strength;	}
	public int getDexterity() { return Dexterity; }
	public int getConstitution() { return Constitution; }
	public int getIntelligence() { return Intelligence; }
	public int getWisdom() { return Wisdom; }
	public int getCharisma() { return Charisma; }
	
	private void generate_standard()
	{
		
	}
}



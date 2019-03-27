import java.util.*;
import java.util.Random;

public class GenerateRandomStats {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	final static Random random = new Random();
	public GenerateRandomStats(int bound) {
		switch(random.nextInt(bound)) {
			case 0:
				generateStandard();
			case 1:
				generate5d6best3();
			case 2:
				generate2d6plus6();
			case 3:
				generate3d6();
		}
	}
	public int getStrength() {	return strength;	}
	public int getDexterity() { return dexterity; }
	public int getConstitution() { return constitution; }
	public int getIntelligence() { return intelligence; }
	public int getWisdom() { return wisdom; }
	public int getCharisma() { return charisma; }
	private void generateStandard() {
		this.strength = random.nextInt(16)+3;
		this.dexterity = random.nextInt(16)+3;
		this.constitution = random.nextInt(16)+3;
		this.intelligence = random.nextInt(16)+3;
		this.wisdom = random.nextInt(16)+3;
		this.charisma = random.nextInt(16)+3;
	}
	private void generate5d6best3() {
		cycleForGenerate5d6best3(this.strength);
		cycleForGenerate5d6best3(this.dexterity);
		cycleForGenerate5d6best3(this.constitution);
		cycleForGenerate5d6best3(this.intelligence);
		cycleForGenerate5d6best3(this.wisdom);
		cycleForGenerate5d6best3(this.charisma);
	}
	private void cycleForGenerate5d6best3(int stat) {
		int roll[] = new int[5];
		for (int i = 0; i < 4; i++) {
			roll[i] = random.nextInt(6);
		}
		Arrays.sort(roll);
		stat = roll[3] + roll[4] + roll[5];
	}
	private void generate2d6plus6() {
		cycleForGenerate2d6plus6(this.strength);
		cycleForGenerate2d6plus6(this.dexterity);
		cycleForGenerate2d6plus6(this.constitution);
		cycleForGenerate2d6plus6(this.intelligence);
		cycleForGenerate2d6plus6(this.wisdom);
		cycleForGenerate2d6plus6(this.charisma);
	}
	private void cycleForGenerate2d6plus6(int stat) {
		for (int i = 0; i < 2; i++) {
			stat = random.nextInt(6);
		}
		stat = stat + 6;
	}
	private void generate3d6() {
		cycleForGenerate3d6(this.strength);
		cycleForGenerate3d6(this.dexterity);
		cycleForGenerate3d6(this.constitution);
		cycleForGenerate3d6(this.intelligence);
		cycleForGenerate3d6(this.wisdom);
		cycleForGenerate3d6(this.charisma);
	}
	private void cycleForGenerate3d6(int stat) {
		for (int i = 0; i < 3; i++) {
			stat = random.nextInt(6);
		}
	}
}



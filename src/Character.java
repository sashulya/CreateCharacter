import java.util.Random;

public class Character {
    final static Random random = new Random();
    public Character() {
    }
    public Character(Race race) {
        this.race = race;
        switch(random.nextInt(2)){
            case 0:
                this.name = this.race.getMaleNamePool()[random.nextInt(this.race.getMaleNamePool().length)];
                this.gender = "Male";
                break;
            case 1:
                this.name = this.race.getFemaleNamePool()[random.nextInt(this.race.getFemaleNamePool().length)];
                this.gender = "Female";
                break;
        }
        setAlignment(random.nextInt(9)+1);
    }
    private String name;
    public String getName() {
        return name;
    }

    private Race race;
    private String gender;
    public Race getRace() {
        return race;
    }
    public String getGender() {
        return gender;
    }
    private String alignment;
    public String getAlignment() {
        return alignment;
    }
    public void setAlignment(int randomChoice) {
        switch(randomChoice){
            case 1:
                this.alignment = "Lawful Good";
                break;
            case 2:
                this.alignment = "Neutral Good";
                break;
            case 3:
                this.alignment = "Chaotic  Good";
                break;
            case 4:
                this.alignment = "Lawful Neutral";
                break;
            case 5:
                this.alignment = "True Neutral";
                break;
            case 6:
                this.alignment = "Chaotic Neutral";
                break;
            case 7:
                this.alignment = "Lawful Evil";
                break;
            case 8:
                this.alignment = "Neutral Evil";
                break;
            case 9:
                this.alignment = "Neutral Evil";
                break;
        }
         ;
    }

    @Override
    public String toString() {
        return "Character:\n" +
                "Name: " + name +
                "\nRace: " + race.getRaceName() +
                "\nGender: " + gender +
                "\nAlignment: " + alignment;
    }
}

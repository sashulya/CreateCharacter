import java.util.Random;

public class Character {
    final static Random random = new Random();
    public Character() {
    }
    public Character(Race race, GenerateRandomStats randomStats) {
        this.race = race;
        this.randomStats = randomStats;
        switch(random.nextInt(2)){
            case 0:
                this.name = this.race.getMaleNamePool()[random.nextInt(this.race.getMaleNamePool().length)];
                this.gender = "Male";
                break;
            case 1:
                this.name = this.race.getFemaleNamePool()[random.nextInt(this.race.getFemaleNamePool().length)];
                this.gender = "Female";
                break;
        } //выбор пола и имени
        setAlignment(random.nextInt(9)+1); //мировозрение
        int tAge = random.nextInt(3); //возраст
        switch (tAge){
            case 0:
                age=race.getAge(tAge);
                typeAge="Intuitive";
                break;
            case 1:
                age=race.getAge(tAge);
                typeAge="Self-Taught";
                break;
            case 2:
                age=race.getAge(tAge);
                typeAge="Trained";
                break;
        }
        height=race.getHeight(gender);
        weight=race.getWeight(gender);
    }
    private String name;
    public String getName() {
        return name;
    }
    private Race race;
    public Race getRace() {
        return race;
    }
    private String gender;
    public String getGender() {
        return gender;
    }
    GenerateRandomStats randomStats;
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
    private int age;
    public int getAge() {
        return age;
    }
    private String typeAge;
    public String getTypeAge() {
        return typeAge;
    }
    private int height;
    public int getHeight() {
        return height;
    }
    private int weight;
    public int getWeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Character:\n" +
                "Name: " + name +
                "\nRace: " + race.getRaceName() +
                "\nGender: " + gender +
                "\nAlignment: " + alignment +
                "\nAge: " + age + " " + typeAge +
                "\nHeight: " + gender + "sm  Weight: " + weight + "kg" +
                "\nStats (bonuses includes)" +
                "\nStrength:" + (randomStats.getStrength()+race.getBonusStrength()) +
                "\nDexterity:" + (randomStats.getDexterity()+race.getBonusDexterity()) +
                "\nConstitution:" + (randomStats.getConstitution()+race.getBonusConstitution()) +
                "\nStrength:" + (randomStats.getIntelligence()+race.getBonusIntelligence()) +
                "\nStrength:" + (randomStats.getWisdom()+race.getBonusWisdom()) +
                "\nStrength:" + (randomStats.getCharisma()+race.getBonusCharisma());


    }
}

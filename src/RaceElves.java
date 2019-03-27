import java.util.Random;

public class RaceElves extends Race{
    final static Random random = new Random();
    private static String[] maleNamePool = {"Caladrel", "Heldalel", "Lanliss", "Meirdrarel", "Seldlon", "Talathel", "Variel", "Zordlon"};
    private static String[] femaleNamePool = {"Amrunelara", "Dardlara", "Faunra", "Jathal", "Merisiel", "Oparal", "Soumral", "Tessara", "Yalandlara"};
    public String[] getMaleNamePool() {
        return maleNamePool;
    }
    public String[] getFemaleNamePool() {
        return femaleNamePool;
    }
    private int baseAge=110;
    private double baseHeight=162.56;
    public RaceElves() {
        super("Elves");
    }
    public int getAge(int randomChoice){
        int age=baseAge;
        switch (randomChoice){
            case 0:
                for (int i=0; i<4;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
            case 1:
                for (int i=0; i<6;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
            case 2:
                for (int i=0; i<10;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
        }
        return 0;
    }
    public int getHeightAndWeight(String gender){
        double height=baseHeight;
        switch (gender){
            case "Male":
                for (int i=0; i<2;i++){
                    height+=2.54*(random.nextInt(8)+1);
                }
                break;
            case "Female":
                for (int i=0; i<2;i++){
                    height+=2.54*(random.nextInt(6)+1);
                }
                break;
        }

        return (int)height;
    }

}

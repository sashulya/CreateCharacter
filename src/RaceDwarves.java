import java.util.Random;

public class RaceDwarves extends Race{
    final static Random random = new Random();
    private static String[] maleNamePool = {"Dolgrin", "Grunyar", "Harsk", "Kazmuk", "Morgrym", "Rogar"};
    private static String[] femaleNamePool = {"Agna", "Bodill", "Ingra", "Kotri", "Rusilka", "Yangrit"};
    public String[] getMaleNamePool() {
        return maleNamePool;
    }
    public String[] getFemaleNamePool() {
        return femaleNamePool;
    }
    private int baseAge=40;
    private double baseMaleHeight=114.3;
    private double baseFemaleHeight=109.22;
    public RaceDwarves() {
        super("Dwarves");
    }
    public int getAge(int randomChoice){
        int age=baseAge;
        switch (randomChoice){
            case 0:
                for (int i=0; i<3;i++){
                    age+=(random.nextInt(6)+1);
                }
            case 1:
                for (int i=0; i<5;i++){
                    age+=(random.nextInt(6)+1);
                }
            case 2:
                for (int i=0; i<7;i++){
                    age+=(random.nextInt(6)+1);
                }
        }
        return age;
    }

    public int getHeightAndWeight(String gender){
        double height=0;
        switch (gender){
            case "Male":
                height=baseMaleHeight;
                break;
            case "Female":
                height=baseFemaleHeight;
                break;
        }
        for (int i=0; i<2;i++){
            height+=2.54*(random.nextInt(4)+1);
        }
        return (int)height;
    }
}

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


    public RaceDwarves() {
        super("Dwarves");
    }

}

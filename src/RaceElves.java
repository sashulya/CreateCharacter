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
    public RaceElves() {
        super("Elves");
    }
}

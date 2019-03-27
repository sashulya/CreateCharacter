import java.util.Random;

abstract class Race {
    final static Random random = new Random();

    public Race(String raceName) {
        this.raceName = raceName;
    }

    private String raceName;
    public String getRaceName() {
        return raceName;
    }
    abstract String[] getMaleNamePool();
    abstract String[] getFemaleNamePool();
}

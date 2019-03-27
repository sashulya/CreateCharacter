import java.util.Random;

public class RaceHumans extends Race{
    final static Random random = new Random();
    private static String[] maleNamePool = {"Alerdene", "Alinza", "Aula", "Bach Hien", "Belka", "Beshkee", "Chammady", "Chao", "Do Quyen", "Eshe", "Eudomia", "Gerda", "Hiriko", "Ilinica", "Indah", "Ingirt", "Izora", "Jalket", "Jayazi", "Kaede", "Kalizama", "Kamshi", "Lestari", "Leyli", "Marisan", "Me’amesa", "Meilin", "Mirelinda", "Mpaandi", "Nalmida", "Nanya", "Narantuyaa", "Ntisi", "Pasara", "Pontia", "Que Xuan", "Revhi", "Runa", "Sahba", "Shirin", "Shivkah", "Sinkitah", "Surenchinua", "Udara", "Umie", "Valki", "Waajida", "Xemne", "Xue", "Zalika", "Zova"};
    private static String[] femaleNamePool = {"Aakif", "Andrezi", "Arasmes", "Bahram", "Baolo", "Barid", "Batsaikhan", "Belor", "Budi", "Darvan", "Dolok", "Eilif", "Garidan", "Gellius", "Hadzi", "Hamengku", "Harisko", "Iacobus", "Jaali", "Jianguo", "Kjell", "Kousei", "Kronug", "Menas", "Mitabu", "Narsius", "Nonek", "Pateba", "Pratavh", "Qorchi", "Ragnar", "Rubani", "Seckor", "Shokamb", "Shuo", "Sunaki", "Suryo", "Tabansi", "Teruawa", "Thanh Liem", "Toan Hao", "Tomorbataar", "Tuong Kinh", "Ursion", "Vachedi", "Viorec", "Yekskya", "Zaiho", "Zhen"};
    public String[] getMaleNamePool() {
        return maleNamePool;
    }
    public String[] getFemaleNamePool() {
        return femaleNamePool;
    }
    private int baseAge=15;
    private double baseMaleHeight=147.32;
    private double baseFemaleHeight=134.62;
    public RaceHumans() {
        super("Humans");
    }
    public int getAge(int randomChoice){
        int age=baseAge;
        switch (randomChoice){
            case 0:
                for (int i=0; i<1;i++){
                    age+=(random.nextInt(4)+1);
                }
                return age;
            case 1:
                for (int i=0; i<1;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
            case 2:
                for (int i=0; i<2;i++){
                    age+=(random.nextInt(6)+1);
                }
                return age;
        }
        return 0;
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
            height+=2.54*(random.nextInt(10)+1);
        }
        return (int)height;
    }
}

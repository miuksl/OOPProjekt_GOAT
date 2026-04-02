public class Ujumine extends Treenimine{
    private boolean lestad;
    private boolean prillid;
    private boolean bassein;

    public Ujumine(int aeg, double distants, boolean lestad, boolean prillid) {
        super(aeg, distants);
        this.lestad = lestad;
        this.prillid = prillid;
        this.bassein = false;
    }

    @Override
    public double tempo() {
        pikkTreening();
        System.out.println();
        double tempo = getAeg() / getDistants();
        if (!bassein) {
            System.out.println("\nMIDA MÖLLU!! KRAKEN RÜNDAB SIND!");
            int suvakas = suvalineNumber();
            if (suvakas == 1) {
                System.out.println("Tänu jumalale, ta on sõbralik! Veejumal annab sulle kiirust juurde!");
                tempo *= 0.85;
            } else if (prillid && (suvakas == 2 || suvakas == 3)) {
                System.out.println("Ta on pahas tujus! Jäid oma prillidest ilma!");
                prillid = false;
            } else if (lestad && (suvakas == 2 || suvakas == 3)) {
                System.out.println("Ta on pahas tujus! Jäid oma lestadest ilma");
                lestad = false;
            }
        }
            if (lestad) {
                System.out.println("Ohhoo! Täna ujud lestadega, oled 20% kiirem! ");
                tempo *= 0.8;
            }
            if (prillid) {
                System.out.println("Võtsid prillid kaasa! Hästi tehtud! Oled kiirem!");
                tempo *= 0.95;
            }
            if (bassein && !prillid) {
                System.out.println("AiaAia! Kurat kus prillid on, kloor teeb silmadele haiget!");
                tempo *= 1.05;
            }
        return Math.round(tempo * 10.0) / 10.0;
    }

    @Override
    public void treening() {
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Ujume meres! Ole ettevaatlik! ");
        } else if (suvakas == 2) {
            System.out.println("Järves on ka mõnus ujuda! Kuid ole valvis! ");
        } else {
            System.out.println("Basseinis on ikka hea treenida!");
            bassein = true;
        }
    }
}
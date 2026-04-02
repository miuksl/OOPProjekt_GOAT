public class Sõudmine extends Treenimine{
    private boolean kaaslane;
    private boolean lained;
    private String ilmatüdruk;

    public Sõudmine(int aeg, double distants, boolean kaaslane) {
        super(aeg, distants);
        this.kaaslane = kaaslane;
        this.lained = false;
        this.ilmatüdruk = misIlmOn();
    }

    // leiab tempo, kui kiirelt kasutaja 1 km läbib ning kasutades erilisi muutujaid
    // muudab see kiirust
    @Override
    public double tempo() {
        pikkTreening();
        System.out.println();
        double tempo = getAeg() / getDistants();
        if (lained) {
            System.out.println("Oi mis lained!! Need tõmbavad kiirust 15% alla!");
            tempo *= 1.15;
        }
        if (kaaslane) {
            System.out.println("Võtsime sõbra kaasa! Täna on trenn 20% võrra lihtsam! ");
            tempo *= 0.8;
        }
        if (ilmatüdruk.equals("Tuuline") && lained==true) {
            int suvakas = suvalineNumber();
            if (suvakas == 1) {
                System.out.println("\n Sul on pärituul, said kiirust juurde!");
                tempo *= 0.9;
            } else if (suvakas == 2) {
                System.out.println("\n Sul on vastutuul... Ai kuramus kui raske on sõuda!");
                tempo *= 1.1;
            } else if (suvakas == 3) {
                tempo *= 1.05;
                System.out.println("Sul on külgtuul, juhitavus on raskendatud! :( ");
            }
        }
        return Math.round(tempo * 10.0) / 10.0;
    }
    //Meetod, mis ütleb kus kasutaja teeb trenni kasutades suvalist numbrit 1-3
    @Override
    public void treening() {
        System.out.println();
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Täna treenid merel! Värske õhk ja taaskäivitus peale! ");
            lained = true;
        } else if (suvakas == 2) {
            System.out.println("Täna treenid jõel! Sinka-vonka! ");
            lained = true;
        } else {
            System.out.println("Täna treenid jõusaalis! Toas on ka tore olla! ");
        }
    }
}

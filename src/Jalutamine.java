public class Jalutamine extends Treenimine{

    private boolean kepikõnd;
    private String ilmakene;
        // konstruktor
    public Jalutamine(int aeg, double distants, boolean kepikõnd) {
        super(aeg, distants);
        this.kepikõnd = kepikõnd;
        this.ilmakene = misIlmOn();
    }


    //Meetod, mis ütleb kus kasutaja teeb trenni kasutades suvalist numbrit 1-3
    @Override
    public void treening() {
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Täna treenid rabas! Vaata maastiku! ");
        } else if (suvakas == 2) {
            System.out.println("Täna treenid metsas! Hinga värsket õhku ja tunne rõõmu! ");
        } else {
            System.out.println("Täna treenid linnas! Naudi linnailu! ");
        }
    }

    @Override
    // leiab tempo, kui kiirelt kasutaja 1 km läbib ning kasutades erilisi muutujaid
    // muudab see kiirust
    public double tempo() {
        pikkTreening();
        System.out.println();
        double tempo = getAeg() / getDistants();
        if (kepikõnd) {
            System.out.println();
            System.out.println("Kepikõnd! Oled 20% kiirem! :)" + "\n");
            tempo *= 0.8;
        }

        if (ilmakene.equals("Vihmane")) {
            System.out.println("Kuradi sitt ilm" + "\n");
            System.out.println();
            tempo *= 1.1;
        }
        return Math.round(tempo * 10.0) / 10.0;
    }
}

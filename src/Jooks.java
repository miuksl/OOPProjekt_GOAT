public class Jooks extends Treenimine{
    private boolean muss;
    private String ilmapoiss;

    public Jooks(int aeg, double distants, boolean muss) {
        super(aeg, distants);
        this.muss = muss;
        this.ilmapoiss = misIlmOn();
    }

    // leiab tempo, kui kiirelt kasutaja 1 km läbib ning kasutades erilisi muutujaid
    // muudab see kiirust
    @Override
    public double tempo() {
        pikkTreening();
        System.out.println();
        double tempo = getAeg() / getDistants();
        if (muss) {
            System.out.println("\n" + "Täna sa kuulad: " + muusikaŽanr());
            System.out.println("Muss mängib, oled kiirus!" + "\n");
            tempo *= 0.9;
        }
        if (ilmapoiss.equals("Vihmane")) {
            System.out.println("Ilm on vihmane. Täna oled natuke aeglasem! " + "\n");
            tempo *= 1.1;
        }
        return Math.round(tempo * 10.0) / 10.0;
    }

    //meetod, mis leiab muusikažanri kasutades suvalist aru
    public String muusikaŽanr(){
        int suvakas = suvalineNumber();
        String muusikažanr = "";

        if (suvakas == 1){
            muusikažanr += "Ooperit... Spetsiifilisemalt Luciano Pavarotti Diskoteek";
        }
        if (suvakas == 2){
            muusikažanr += "Hip Hopi, ehk Kanye West";
        }
        if (suvakas == 3){
            muusikažanr += "K-Popi...BTS :=0";
        }
        return muusikažanr;
    }

    //meetod, mis annab treenimiskoha, kasutades suvalist arvu.
    @Override
    public void treening() {
        System.out.println();
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Täna treenid rabas! Hea poiss!");
        } else if (suvakas == 2) {
            System.out.println("Täna treenid džunglis! Väike pärdik! ");
        } else {
            System.out.println("Täna treenid linnas! Ole ettevaatlik autodega!");
        }
    }
}

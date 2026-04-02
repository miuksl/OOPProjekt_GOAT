public class Rattasõit extends Treenimine{
    private boolean elektriratas;
    private String ilmatüdruk;

    public Rattasõit(int aeg, double distants, boolean elektriratas) {
        super(aeg, distants);
        this.elektriratas = elektriratas;
        this.ilmatüdruk = misIlmOn();
    }
    // leiab suvalise numbri alusel, kus kasutaja täna trenni teeb
    @Override
    public void treening() {
        pikkTreening();
        System.out.println();
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Täna treenid maanteel! Ole ettevaatlik! ");
        } else if (suvakas == 2) {
            System.out.println("Täna treenid jõusaali ratastel! Lihtne, kuid efektiivne! ");
        } else {
            System.out.println("Täna treenid linnas! On mida vaadata! ");
        }
    }

    // leiab tempo, kui kiirelt kasutaja 1 km läbib ning kasutades erilisi muutujaid
    // muudab see kiirust
    @Override
    public double tempo() {
        String tuul = tuuleOlek();

        double tempo = getAeg() / getDistants();
        if (elektriratas) {
            System.out.println("Täna elektri peal! Veab sul väike pärdik! ");
            tempo *= 0.7;
        }
        if (ilmatüdruk.equals("Vihmane")) {
            tempo *= 1.05;
        }
        if (tuul.equals("Pärituul")){
            System.out.println("Jehhuu! Täna on tuulega vedanud. :)");
            tempo *= 0.9;
        } else if (tuul.equals("Vastutuul")) {
            tempo *= 1.1;
        } else {
            System.out.println("\nTäna on tuulevaikne! Pole muudatust sinu tempole.");
        }
        return Math.round(tempo * 10.0) / 10.0;
    }
    // leiab 1-3 vahemikus suvalise numbri ning selle põhjal valib, mis tuulega on konkreetsel päeval tegemist
    public String tuuleOlek(){
        int suvakas = suvalineNumber();
        String misTuul = "";

        if (suvakas==1){
            misTuul +="Pärituul";
        }
        if(suvakas==2){
            misTuul += "Vastutuul";
        }
        if (suvakas == 3){
            misTuul += "Tuulevaikne";
        }
        return misTuul;
    }
}

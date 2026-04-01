public class Jalutamine extends Treenimine{

    private boolean kepikõnd;
    private String ilmakene;

    public Jalutamine(int aeg, double distants, boolean kepikõnd) {
        super(aeg, distants);
        this.kepikõnd = kepikõnd;
        this.ilmakene = misIlmOn();
    }

    @Override
    public void treening() {
        int suvakas = suvalineNumber();
        if (suvakas == 1) {
            System.out.println("Täna treenid rabas! Good boy! ");
        } else if (suvakas == 2) {
            System.out.println("Täna treenid metsas! Bad boy! ");
        } else {
            System.out.println("Täna treenid linnas! Sitakott! ");
        }
    }

    @Override
    public double tempo() {
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

    @Override
    public String toString() {
        return "Hetkel olen loodud!";
    }
}

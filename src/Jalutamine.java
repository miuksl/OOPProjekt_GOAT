public class Jalutamine extends Treenimine{

    private boolean kepikõnd;
    private double distants;

    public Jalutamine(int aeg) {
        super(aeg);
        this.kepikõnd = kepikõnd;
    }

    @Override
    public String misIlmOn() {
        return super.misIlmOn();
    }

    public void treening() {

        int suvakas = suvalineNumber();
        System.out.println(suvakas);
    }
}

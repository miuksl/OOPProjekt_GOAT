public abstract class Treenimine {
    private int aeg;
    private double distants;

    public Treenimine(int aeg, double distants) {
        this.aeg = aeg;
        this.distants = distants;
    }

    public abstract void treening();

    public abstract double tempo();

    public boolean pikkTreening() {
        return aeg > 60;
    }

    public int suvalineNumber(){
        int number = (int) (Math.random() * 3) + 1;
        return number;
    }

    public String misIlmOn(){
        int number = suvalineNumber();
        if (number == 1) {
            return "Päikeseline";
        } else if (number == 2) {
            return "Vihmane";
        } else {
            return "Tuuline";
        }
    }

    public int getAeg() {
        return aeg;
    }

    public void setAeg(int aeg) {
        this.aeg = aeg;
    }

    public double getDistants() {
        return distants;
    }

    public void setDistants(double distants) {
        this.distants = distants;
    }


}

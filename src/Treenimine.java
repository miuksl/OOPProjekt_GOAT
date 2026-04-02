public abstract class Treenimine {
    private int aeg;
    private double distants;

    public Treenimine(int aeg, double distants) {
        this.aeg = aeg;
        this.distants = distants;
    }

    //Abstraktne meetod treening
    public abstract void treening();

    //Abstraktne meetod tempo
    public abstract double tempo();


    //meetod, mis väljastab arvestades treeningu pikkusega
    public void pikkTreening() {
        if (aeg >= 60) {
            System.out.println("Ossa! Täna on pikk treening käsil! Higistame palju! \n");
        } else if (aeg < 60) {
            System.out.println("Natuke lühem trenn täna. Pole hullu, homme pikemalt! \n");
        } else {
            System.out.println("Tee trenni paksu!\n");
        }
    }


    //Suvalise numbri generaator
    public int suvalineNumber(){
        int number = (int) (Math.random() * 3) + 1;
        return number;
    }

    //meetod, mis annab meile ilma
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

    @Override
    public String toString() {
        return "Otsustasid teha " + aeg + " minutit trenni, distantsil " + distants + " km";
    }
}

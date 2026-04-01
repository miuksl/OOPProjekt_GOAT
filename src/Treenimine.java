public abstract class Treenimine {
    private int aeg;
    private String ilm;

    public Treenimine(int aeg) {
        this.aeg = aeg;
    }

    public abstract void treening();

    public int suvalineNumber(){
        int number = (int) (Math.random() * 3) + 1;
        System.out.println(number);
        return number;
    }

    public String misIlmOn(){
        int number = suvalineNumber();
        System.out.println(number);
        if (number == 1) {
            return "Päikeseline";
        } else if (number == 2) {
            return "Vihmane";
        } else {
            return "Tuuline";
        }
    }

    public double getAeg() {
        return aeg;
    }

    public void setAeg(int aeg) {
        this.aeg = aeg;
    }

    @Override
    public String toString() {
        return "Treenimine{" +
                ", aeg=" + aeg +
                '}';
    }
}

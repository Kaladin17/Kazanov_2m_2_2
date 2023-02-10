public class TV extends Appliances implements Printable{
    private int countCanal;

    public TV(int countCanal, String model) {
        super(model);
        this.countCanal = countCanal;
    }

    public int getCountCanal() {
        return countCanal;
    }

    public void setCountCanal(int countCanal) {
        this.countCanal = countCanal;
    }

    @Override
    public void print() {
        System.out.println("\nCount canal: " + this.countCanal + "\nModel: " + getModel());
    }
}

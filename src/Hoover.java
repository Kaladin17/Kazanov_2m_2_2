public class Hoover extends Appliances implements Printable{
    private Enum mode;

    public Hoover(Enum mode, String model) {
        super(model);
        this.mode = mode;
    }

    public Enum getMode() {
        return mode;
    }

    public void setMode(Enum mode) {
        this.mode = mode;
    }

    @Override
    public void print() {
        System.out.println("\nMode: " + this.mode + "\nModel: " + getModel());
    }
}

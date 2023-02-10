public class Fridge extends Appliances implements Printable{
    private int minTemperature;

    public Fridge(int minTemperature, int maxTemperature, String model) {
        super(model);
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    private int maxTemperature;


    @Override
    public void print() {
        System.out.println("\nMin temperature: " + this.minTemperature + "\nMax temperature: " + this.maxTemperature + "\nModel: " + getModel());

    }
}

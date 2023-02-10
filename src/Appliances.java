public class Appliances implements Printable{
    private String model;

    public Appliances(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void print() {

    }
}

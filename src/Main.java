import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printable[] appliances = {
                createObject("Fridge"),
                createObject("TV"),
                createObject("Hoover")
        };
        for (int i = 0; i < appliances.length; i++) {
            appliances[i].print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Fridge":
                Fridge fridge1 = new Fridge(-3, 5, "B1");
                return fridge1;
            case "TV":
                TV tv1 = new TV(90, "B2");
                return tv1;
            case "Hoover":
                Hoover hoover1 = new Hoover(Mode.INTENSIVE_CLEANING, "B3");
                return hoover1;
        }
        return null;
    }
}
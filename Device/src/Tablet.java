
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Tablet extends Device {
    private String operatingSystem;
    private double screenSize;

    public Tablet(String type, double price, double weight, String operatingSystem, double screenSize) {
        super(type, price, weight);
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}


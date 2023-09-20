import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Laptop extends Device {
    private String processor;
    private int memoryGB;

    public Laptop(String type, double price, double weight, String processor, int memoryGB) {
        super(type, price, weight);
        this.processor = processor;
        this.memoryGB = memoryGB;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }
}

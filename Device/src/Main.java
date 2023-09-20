import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of devices to create (between 1 and 20): ");
        int numDevices = scanner.nextInt();

        if (numDevices < 1 || numDevices > 20) {
            System.out.println("Number of devices must be between 1 and 20");
            return;
        }

        ArrayList<Device> devices = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < numDevices; i++) {
            int deviceType = random.nextInt(3);
            switch (deviceType) {
                case 0:
                    devices.add(new Smartphone("Smartphone",
                            random.nextDouble() * 1000,
                            random.nextDouble() * 500,
                            random.nextDouble() * 6.0,
                            random.nextInt(20) + 5));
                    break;
                case 1:
                    devices.add(new Laptop("Laptop",
                            random.nextDouble() * 2000,
                            random.nextDouble() * 3000,
                            "Intel Core i" + (random.nextInt(10) + 1),
                            random.nextInt(32) + 4));
                    break;
                case 2:
                    devices.add(new Tablet("Tablet",
                            random.nextDouble() * 500,
                            random.nextDouble() * 700,
                            "Android",
                            random.nextDouble() * 12.0));
                    break;
            }
        }

        scanner.close();

        int distinctDeviceTypes = countDistinctDeviceTypes(devices);
        double totalPrice = calculateTotalPrice(devices);
        double totalWeight = calculateTotalWeight(devices);

        System.out.println("Number of distinct device types created: " + distinctDeviceTypes);
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");
    }
    private static int countDistinctDeviceTypes(ArrayList<Device> devices) {
        ArrayList<String> deviceTypes = new ArrayList<>();
        for (Device device : devices) {
            String type = device.getType();
            if (!deviceTypes.contains(type)) {
                deviceTypes.add(type);
            }
        }
        return deviceTypes.size();
    }


    private static double calculateTotalPrice(ArrayList<Device> devices) {
        double totalPrice = 0;
        for (Device device : devices) {
            totalPrice += device.getPrice();
        }
        return totalPrice;
    }


    private static double calculateTotalWeight(ArrayList<Device> devices) {
        double totalWeight = 0;
        for (Device device : devices) {
            totalWeight += device.getWeight();
        }
        return totalWeight;
    }
}


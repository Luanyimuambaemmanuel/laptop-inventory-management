public class Laptop {
    private String brand;
    private String model;
    private String serialNumber;

    public Laptop(String brand, String model, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getSerialNumber() { return serialNumber; }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Serial Number: " + serialNumber;
    }
}


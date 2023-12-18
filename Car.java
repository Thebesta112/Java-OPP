public class Car{
    private String brand;
    private String model;
    private int year;
    private double engineSize;
    private int numOfDoors;
    private boolean isAutomatic;
    private String color;
    private double mileage;
    public Car(String brand, String model, int year, double engineSize, int numOfDoors, boolean isAutomatic, String color, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineSize = engineSize;
        this.numOfDoors = numOfDoors;
        this.isAutomatic = isAutomatic;
        this.color = color;
        this.mileage = mileage;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}


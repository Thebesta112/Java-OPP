public class Plane{
    private String manufacturer;
    private String model;
    private int year;
    private int seatingCapacity;
    private double maxSpeed;
    private double fuelCapacity;
    private boolean isCommercial;
    private String propulsionType;
    public Plane(String manufacturer, String model, int year, int seatingCapacity, double maxSpeed, double fuelCapacity, boolean isCommercial, String propulsionType) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.seatingCapacity = seatingCapacity;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        this.isCommercial = isCommercial;
        this.propulsionType = propulsionType;
    }
    public String getModel() {
        return model;
    }
}


public class Boat{
    private String name;
    private String type;
    private int yearBuilt;
    private double length;
    private double width;
    private double maxSpeed;
    private int passengerCapacity;
    private boolean isCargoBoat;
    public Boat(String name, String type, int yearBuilt, double length, double width, double maxSpeed, int passengerCapacity, boolean isCargoBoat) {
        this.name = name;
        this.type = type;
        this.yearBuilt = yearBuilt;
        this.length = length;
        this.width = width;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.isCargoBoat = isCargoBoat;
    }
    public String getName() {
        return name;
    }
}


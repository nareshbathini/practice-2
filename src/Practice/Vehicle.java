package Practice;

public class Vehicle {
    private String vehicleMake;
    private int vehicleYear;

    public Vehicle(String vehicleMake, int vehicleYear) {
        this.vehicleMake = vehicleMake;
        this.vehicleYear = vehicleYear;
        System.out.println("Practice.Vehicle Constructor called");
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public int getVehicleYear() {
        return vehicleYear;
    }

}

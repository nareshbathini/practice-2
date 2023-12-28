package Practice;

import Practice.Car;

public class VehicleMainClass {
    public static void main(String []args){
        Car car=new Car("Tata", 2023);
        System.out.println(car.getVehicleMake());
        System.out.println(car.getVehicleYear());


    }
}

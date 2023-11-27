import FactoryMethod.*;
import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

//        Singleton
        Singleton instance01 = Singleton.getINSTANCE();
        Singleton instance02 = Singleton.getINSTANCE();
        System.out.println("Same instance? " + (instance01 == instance02));

//        Factory Method
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory shipFactory = new ShipFactory();
        VehicleFactory planeFactory = new PlaneFactory();
        Vehicle car = carFactory.createVehicle();
        Vehicle ship = shipFactory.createVehicle();
        Vehicle plane = planeFactory.createVehicle();
        car.move();
        ship.move();
        plane.move();

    }
}

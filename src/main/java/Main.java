import CreationalDesignPatterns.FactoryMethod.ConcreteCreator.CarFactory;
import CreationalDesignPatterns.FactoryMethod.ConcreteCreator.PlaneFactory;
import CreationalDesignPatterns.FactoryMethod.ConcreteCreator.ShipFactory;
import CreationalDesignPatterns.FactoryMethod.Creator.VehicleFactory;
import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;
import CreationalDesignPatterns.Singleton.Singleton;
import StructuralDesignPatterns.Adapter.HDMI;
import StructuralDesignPatterns.Adapter.HDMItoVGAAdapter;
import StructuralDesignPatterns.Adapter.Laptop;
import StructuralDesignPatterns.Adapter.Projector;

public class Main {
    public static void main(String[] args) {

//        Singleton
//        Singleton instance01 = Singleton.getINSTANCE();
//        Singleton instance02 = Singleton.getINSTANCE();
//        System.out.println("SINGLETON----------");
//        System.out.println("Same instance? " + (instance01 == instance02));

//        Factory Method
//        VehicleFactory carFactory = new CarFactory();
//        VehicleFactory shipFactory = new ShipFactory();
//        VehicleFactory planeFactory = new PlaneFactory();
//        Vehicle car = carFactory.createVehicle();
//        Vehicle ship = shipFactory.createVehicle();
//        Vehicle plane = planeFactory.createVehicle();
//        System.out.println("FACTORY METHOD----------");
//        car.move();
//        ship.move();
//        plane.move();

//        Adapter
        Projector projector = new Projector();
        HDMI adapter = new HDMItoVGAAdapter(projector);
        Laptop laptop = new Laptop(adapter);
        laptop.transferData();
    }
}

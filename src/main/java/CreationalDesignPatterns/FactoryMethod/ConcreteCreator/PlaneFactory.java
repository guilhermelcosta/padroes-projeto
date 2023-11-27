package CreationalDesignPatterns.FactoryMethod.ConcreteCreator;

import CreationalDesignPatterns.FactoryMethod.ConcreteProduct.Plane;
import CreationalDesignPatterns.FactoryMethod.Creator.VehicleFactory;
import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}

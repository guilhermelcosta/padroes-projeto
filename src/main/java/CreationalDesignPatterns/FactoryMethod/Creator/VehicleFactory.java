package CreationalDesignPatterns.FactoryMethod.Creator;

import CreationalDesignPatterns.FactoryMethod.Product.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}

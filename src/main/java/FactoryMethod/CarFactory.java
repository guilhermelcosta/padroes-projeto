package FactoryMethod;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

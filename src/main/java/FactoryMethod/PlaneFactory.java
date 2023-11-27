package FactoryMethod;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}

package FactoryMethod;

public class ShipFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }
}

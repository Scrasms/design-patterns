package factory.vehicle;

// Concrete Creator class
public class PlaneFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int price) {
        return new Plane(price);
    }
}

package factory.vehicle;

// Concrete Creator class
public class BoatFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int price) {
        return new Boat(price);
    }
}

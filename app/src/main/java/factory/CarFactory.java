package factory;

// Concrete Creator class
public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(int price) {
        return new Car(price);
    }
}

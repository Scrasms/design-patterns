package factory.vehicle;

// Creator class that declares the factory method createVehicle
public abstract class VehicleFactory {
    public abstract Vehicle createVehicle(int price);

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle(4000);
        System.out.println("Car price:" + car.getPrice());
        System.out.println(car.moveTo("Sydney"));

        PlaneFactory planeFactory = new PlaneFactory();
        Vehicle plane = planeFactory.createVehicle(50000);
        System.out.println("Plane price:" + plane.getPrice());
        System.out.println(plane.moveTo("Melbourne"));

        BoatFactory boatFactory = new BoatFactory();
        Vehicle boat = boatFactory.createVehicle(200000);
        System.out.println("boat price:" + boat.getPrice());
        System.out.println(boat.moveTo("Adelaide"));
    }
}

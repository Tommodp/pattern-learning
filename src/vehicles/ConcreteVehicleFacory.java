package vehicles;

public class ConcreteVehicleFacory extends VehicleFactory{

    public ConcreteVehicleFacory() {
    }

    public ConcreteVehicleFacory(double chanceCar, double chanceBus, double chanceBicycle, double chancePedestrian) {
        super(chanceCar, chanceBus, chanceBicycle, chancePedestrian);
    }


    @Override
    public Vehicle createVehicle() {
        // get a random number between 0.0 and 1.0
        double r = Math.random();
        if (r < chanceCar){
            return new Car();
        }
        else if (r < chanceCar + chanceBus) {
            return new Bus();
        }
        else if (r < chanceCar + chanceBus + chanceBicycle) {
            return new Bicycle();
        }
        else if (r < chanceCar + chanceBus + chanceBicycle + chancePedestrian) {
            return new Pedestrian();
        }
        else {
            return null;
        }
    }
}

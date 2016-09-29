package vehicles;

public class Vehicle {
    private double speed = 0;
    private double maxSpeed;
    private double length;

    protected Vehicle(double length, double maxSpeed) {
        this.length = length;
        this.maxSpeed = maxSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getLength() {
        return length;
    }

    public void accelerate(double deltaV) {
        if (this.speed + deltaV < 0) {
            this.speed = 0.0;
        } else if ((speed + deltaV) <= maxSpeed) {
            this.speed += deltaV;
        } else {
            this.speed = maxSpeed;
        }
    }

    public void decelerate(double deltaV) {
        accelerate(-deltaV);
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}

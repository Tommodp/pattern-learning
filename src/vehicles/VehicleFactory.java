package vehicles;

public abstract class VehicleFactory {
    protected double chanceCar = 0.8;
    protected double chanceBus = 0.1;
    protected double chanceBicycle = 0.1;
    protected double chancePedestrian;

    public VehicleFactory() {
        this(80, 10, 10, 0);
    }

    public VehicleFactory(double chanceCar, double chanceBus,
                          double chanceBicycle, double chancePedestrian) {

        // Negative probabilities make no sense.
        // Therefore, enforce the constraint that
        // each probability is greater than zero
        if (chanceCar < 0.0) chanceCar = 0.0;
        if (chanceBus < 0.0) chanceBus = 0.0;
        if (chanceBicycle < 0.0) chanceBicycle = 0.0;
        if (chancePedestrian < 0.0) chancePedestrian = 0.0;

        // Since you must enforce the constraint that the sum
        // of the probabilities is 1.0 (100%), you
        // have to normalize. You should not assume that
        // the arguments add to 1.00 (100%)
        // This has the beneficial side effect of allowing
        // clients to use either floating point numbers between
        // 0.0 and 1.0 or percentages between 0 and 100 as they prefer.
        double normalization = chanceCar + chanceBus
                + chanceBicycle + chancePedestrian;

        // avoid division by zero,
        if (normalization == 0) normalization = 1.0;
        this.chanceCar = chanceCar / normalization;
        this.chanceBus = chanceBus / normalization;
        this.chanceBicycle = chanceBicycle / normalization;
        this.chancePedestrian = chancePedestrian / normalization;

    }

    public abstract Vehicle createVehicle();

}

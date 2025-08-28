package creational_patterns.builder.cars;

import creational_patterns.builder.components.Engine;
import creational_patterns.builder.components.GPSNavigator;
import creational_patterns.builder.components.Transmission;
import creational_patterns.builder.components.TripComputer;

/**
 * Car is a product class.
 */
public class Car {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private double fuelConsumption = 0;

    public Car(CarType type,
               int seats,
               Engine engine,
               Transmission transmission,
               TripComputer tripComputer,
               GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
        if (tripComputer != null) {
            this.tripComputer.setCar(this);
        }
    }

    public CarType getType() {
        return type;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGPSNavigator() {
        return gpsNavigator;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }


}

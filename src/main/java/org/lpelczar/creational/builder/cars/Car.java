package org.lpelczar.creational.builder.cars;

import org.lpelczar.creational.builder.components.Engine;
import org.lpelczar.creational.builder.components.GPSNavigator;
import org.lpelczar.creational.builder.components.Transmission;
import org.lpelczar.creational.builder.components.TripComputer;

public class Car {
  private final Type type;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;
  private TripComputer tripComputer;
  private final GPSNavigator gpsNavigator;
  private double fuel = 0;

  public Car(Type type, int seats, Engine engine, Transmission transmission,
      TripComputer tripComputer, GPSNavigator gpsNavigator) {
    this.type = type;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    if (tripComputer != null) {
      this.tripComputer = tripComputer;
      this.tripComputer.setCar(this);
    }
    this.gpsNavigator = gpsNavigator;
  }

  public Type getType() {
    return type;
  }

  public double getFuel() {
    return fuel;
  }

  public void setFuel(double fuel) {
    this.fuel = fuel;
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

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  public GPSNavigator getGpsNavigator() {
    return gpsNavigator;
  }
}

package org.lpelczar.creational.builder.builders;

import org.lpelczar.creational.builder.cars.Type;
import org.lpelczar.creational.builder.components.Engine;
import org.lpelczar.creational.builder.components.GPSNavigator;
import org.lpelczar.creational.builder.components.Transmission;
import org.lpelczar.creational.builder.components.TripComputer;

public class CarBuilder implements Builder {

  private Type type;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private TripComputer tripComputer;
  private GPSNavigator gpsNavigator;

  @Override
  public void setType(Type type) {

  }

  @Override
  public void setSeats(int seats) {

  }

  @Override
  public void setEngine(Engine engine) {

  }

  @Override
  public void setTransmission(Transmission transmission) {

  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {

  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {

  }
}

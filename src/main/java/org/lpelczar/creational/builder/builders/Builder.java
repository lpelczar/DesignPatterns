package org.lpelczar.creational.builder.builders;

import org.lpelczar.creational.builder.cars.Type;
import org.lpelczar.creational.builder.components.Engine;
import org.lpelczar.creational.builder.components.GPSNavigator;
import org.lpelczar.creational.builder.components.Transmission;
import org.lpelczar.creational.builder.components.TripComputer;

public interface Builder {

  void setType(Type type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);

}

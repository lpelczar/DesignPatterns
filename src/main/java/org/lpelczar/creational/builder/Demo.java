package org.lpelczar.creational.builder;

import org.lpelczar.creational.builder.builders.CarBuilder;
import org.lpelczar.creational.builder.builders.CarManualBuilder;
import org.lpelczar.creational.builder.cars.Car;
import org.lpelczar.creational.builder.cars.Manual;
import org.lpelczar.creational.builder.director.Director;

public class Demo {

  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSportsCar(builder);

    Car car = builder.getResult();
    System.out.println("Car built:\n" + car.getType());

    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructSportsCar(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}

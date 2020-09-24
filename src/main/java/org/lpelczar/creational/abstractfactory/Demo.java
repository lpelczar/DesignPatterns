package org.lpelczar.creational.abstractfactory;

import org.lpelczar.creational.abstractfactory.factory.GUIFactory;
import org.lpelczar.creational.abstractfactory.factory.MacOSFactory;
import org.lpelczar.creational.abstractfactory.factory.WindowsFactory;

public class Demo {

  private static Application configureApplication() {
    Application application;
    GUIFactory factory;

    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacOSFactory();
    } else {
      factory = new WindowsFactory();
    }
    application = new Application(factory);

    return application;
  }

  public static void main(String[] args) {
    Application application = configureApplication();
    application.paint();
  }

}

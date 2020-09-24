package org.lpelczar.creational.abstractfactory;

import org.lpelczar.creational.abstractfactory.button.Button;
import org.lpelczar.creational.abstractfactory.checkbox.Checkbox;
import org.lpelczar.creational.abstractfactory.factory.GUIFactory;

public class Application {

  private final Button button;
  private final Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.paint();
    checkbox.paint();
  }

}

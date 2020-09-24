package org.lpelczar.creational.abstractfactory.factory;

import org.lpelczar.creational.abstractfactory.button.Button;
import org.lpelczar.creational.abstractfactory.button.MacOSButton;
import org.lpelczar.creational.abstractfactory.checkbox.Checkbox;
import org.lpelczar.creational.abstractfactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacOSButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacOSCheckbox();
  }
}

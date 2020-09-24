package org.lpelczar.creational.abstractfactory.factory;

import org.lpelczar.creational.abstractfactory.button.Button;
import org.lpelczar.creational.abstractfactory.button.WindowsButton;
import org.lpelczar.creational.abstractfactory.checkbox.Checkbox;
import org.lpelczar.creational.abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckbox();
  }
}

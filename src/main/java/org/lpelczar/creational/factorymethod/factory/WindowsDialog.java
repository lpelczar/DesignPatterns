package org.lpelczar.creational.factorymethod.factory;

import org.lpelczar.creational.factorymethod.button.Button;
import org.lpelczar.creational.factorymethod.button.WindowsButton;

public class WindowsDialog extends Dialog {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}

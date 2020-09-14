package org.lpelczar.creational.factorymethod.factory;

import org.lpelczar.creational.factorymethod.button.Button;

public abstract class Dialog {

  public void renderWindow() {
    Button okButton = createButton();
    okButton.render();
  }

  public abstract Button createButton();

}

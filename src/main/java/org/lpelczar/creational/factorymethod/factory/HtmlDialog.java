package org.lpelczar.creational.factorymethod.factory;

import org.lpelczar.creational.factorymethod.button.Button;
import org.lpelczar.creational.factorymethod.button.HtmlButton;

public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}

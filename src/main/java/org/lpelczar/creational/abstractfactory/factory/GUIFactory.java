package org.lpelczar.creational.abstractfactory.factory;

import org.lpelczar.creational.abstractfactory.button.Button;
import org.lpelczar.creational.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {

  Button createButton();

  Checkbox createCheckbox();

}

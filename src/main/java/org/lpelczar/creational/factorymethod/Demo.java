package org.lpelczar.creational.factorymethod;

import org.lpelczar.creational.factorymethod.factory.Dialog;
import org.lpelczar.creational.factorymethod.factory.HtmlDialog;
import org.lpelczar.creational.factorymethod.factory.WindowsDialog;

public class Demo {

  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }

  static void configure() {
    if (System.getProperty("os.name").equals("Windows 10")) {
      dialog = new WindowsDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  static void runBusinessLogic() {
    dialog.renderWindow();
  }

}

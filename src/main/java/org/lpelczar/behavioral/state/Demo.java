package org.lpelczar.behavioral.state;

import org.lpelczar.behavioral.state.ui.Player;
import org.lpelczar.behavioral.state.ui.UI;

public class Demo {
  public static void main(String[] args) {
    Player player = new Player();
    UI ui = new UI(player);
    ui.init();
  }
}

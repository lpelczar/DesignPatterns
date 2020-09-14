package org.lpelczar.creational.factorymethod.button;

public class HtmlButton implements Button {

  @Override
  public void render() {
    System.out.println("<button>Button</button>");
  }

  @Override
  public void onClick() {
    System.out.println("Click!");
  }
}

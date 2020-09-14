package org.lpelczar.creational.factorymethod.button;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WindowsButton implements Button {

  JPanel panel = new JPanel();
  JFrame frame = new JFrame();
  JButton button;

  @Override
  public void render() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Hello World!");
    label.setOpaque(true);
    label.setBackground(new Color(235, 233, 126));
    label.setFont(new Font("Dialog", Font.BOLD, 44));
    label.setHorizontalAlignment(SwingConstants.CENTER);
    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
    frame.getContentPane().add(panel);
    panel.add(label);

    frame.setSize(320, 200);
    frame.setVisible(true);

    button = new JButton("Exit");
    button.addActionListener(e -> onClick());
    panel.add(button);
  }

  @Override
  public void onClick() {
    frame.setVisible(false);
    System.exit(0);
  }
}

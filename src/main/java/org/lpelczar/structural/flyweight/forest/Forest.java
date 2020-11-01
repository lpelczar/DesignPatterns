package org.lpelczar.structural.flyweight.forest;

import org.lpelczar.structural.flyweight.trees.Tree;
import org.lpelczar.structural.flyweight.trees.TreeType;
import org.lpelczar.structural.flyweight.trees.TreeTypeFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
  private List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
    TreeType type = TreeTypeFactory.getTreeType(name, color, otherTreeData);
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}

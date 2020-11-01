package org.lpelczar.behavioral.visitor.visitor;

import org.lpelczar.behavioral.visitor.shapes.Circle;
import org.lpelczar.behavioral.visitor.shapes.CompoundShape;
import org.lpelczar.behavioral.visitor.shapes.Dot;
import org.lpelczar.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
  String visitDot(Dot dot);

  String visitCircle(Circle circle);

  String visitRectangle(Rectangle rectangle);

  String visitCompoundGraphic(CompoundShape cg);
}

package org.lpelczar.behavioral.mediator.components;

import org.lpelczar.behavioral.mediator.Mediator;

public interface Component {
  void setMediator(Mediator mediator);

  String getName();
}

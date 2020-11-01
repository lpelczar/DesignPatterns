package org.lpelczar.behavioral.memento.commands;

public interface Command {
  String getName();

  void execute();
}

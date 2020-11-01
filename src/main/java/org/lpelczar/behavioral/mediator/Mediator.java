package org.lpelczar.behavioral.mediator;

import org.lpelczar.behavioral.mediator.components.Component;

import javax.swing.*;

public interface Mediator {
  void addNewNote(Note note);

  void deleteNote();

  void getInfoFromList(Note note);

  void saveChanges();

  void markNote();

  void clear();

  void sendToFilter(ListModel listModel);

  void setElementsList(ListModel list);

  void registerComponent(Component component);

  void hideElements(boolean flag);

  void createGUI();
}

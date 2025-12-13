package ru.otus.java.basic.homeworks.homework9.gemini.usersession;

import ru.otus.java.basic.homeworks.homework9.gemini.usersession.my_exception.EmptyHistoryException;

import java.util.LinkedList;
import java.util.List;

public class UserSession implements AutoCloseable {
    private LinkedList<String> actionHistory;
    private static final int MAX_HISTORY = 5;

    public UserSession(LinkedList<String> actionHistory) {
        this.actionHistory = actionHistory;
    }

    public List<String> getActionHistory() {
        return actionHistory;
    }

    public void longAction(String action) {
        if (actionHistory.size() > MAX_HISTORY) {
            actionHistory.removeFirst();
        }
        actionHistory.addLast(action);
    }

    public void undoLastAction() {
        if (actionHistory == null || actionHistory.isEmpty()) {
            throw new EmptyHistoryException("Список пуст");
        }
        actionHistory.removeLast();
    }

    @Override
    public void close() {
        System.out.println("История сохранена");
    }
}

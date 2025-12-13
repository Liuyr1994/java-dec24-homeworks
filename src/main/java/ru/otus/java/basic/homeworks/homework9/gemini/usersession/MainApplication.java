package ru.otus.java.basic.homeworks.homework9.gemini.usersession;

import ru.otus.java.basic.homeworks.homework9.gemini.usersession.my_exception.EmptyHistoryException;

import java.util.LinkedList;

public class MainApplication {
    public static void main(String[] args) {
        try (UserSession userSession = new UserSession(new LinkedList<>())) {
            userSession.longAction("Действие 1");
            userSession.undoLastAction();
        } catch (EmptyHistoryException e) {
            System.out.println(e);
        }
    }
}

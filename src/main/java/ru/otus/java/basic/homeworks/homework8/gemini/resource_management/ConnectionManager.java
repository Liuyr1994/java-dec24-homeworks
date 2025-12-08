package ru.otus.java.basic.homeworks.homework8.gemini.resource_management;

public class ConnectionManager implements AutoCloseable {
    private boolean isClosed = false;

    public boolean isClosed() {
        return isClosed;
    }

    public String fetch(String query) throws ResourceAccessException {
        if (isClosed) throw new ResourceAccessException("Соединение закрыто");
        StringBuilder sb = new StringBuilder();
        sb.append(query).append(" ").append("[FETCHED]");
        return sb.toString();
    }


    @Override
    public void close() throws Exception {
        System.out.println("Соединение закрыто");
        isClosed = true;
    }
}

package ru.otus.java.basic.homeworks.homework6.gpt.chat;

public class ChatMessage {
    private final String author;
    private final String text;
    private final long timeStamp;

    public ChatMessage(String author, String text, long timeStamp) {
        if (isCheck(author)) {
            this.author = author;
        } else {
            this.author = "Dostoevskiy";
        }
        if (isCheck(text)) {
            this.text = text;
        } else {
            this.text = "Просто текст";
        }

        this.timeStamp = timeStamp;
    }

    public String preview(int length) {
        if (text.length() == 0 || text.isBlank()) {
            return " ";
        } else if (length >= text.length()) {
            return text;
        }
        String txt = text.substring(0, length);
        return txt;
    }

    public ChatMessage withText(String newText) {
        return new ChatMessage(author, newText, timeStamp);
    }

    private boolean isCheck(String s) {
        if (s != null || !s.isBlank()) return true;
        return false;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}

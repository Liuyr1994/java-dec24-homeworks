package ru.otus.java.basic.homeworks.homework6.gpt.chat;

public class MainApplications {
    public static void main(String[] args) {
        ChatMessage chatMessage = new ChatMessage("Henadzi", "ergheroigeriojfedfvjbiegr", 1234);
        System.out.println(chatMessage.preview(13));
        System.out.println(chatMessage.withText("12345"));
    }
}

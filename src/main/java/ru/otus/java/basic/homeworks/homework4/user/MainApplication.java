package ru.otus.java.basic.homeworks.homework4.user;

public class MainApplication {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Bessonov", "Aleksandrovich", "Henadzi", 31, "lok.orda@mail.ru");
        users[1] = new User("Bessonov", "Aleksandrovich", "Henadzi", 41, "lok.orda@mail.ru");
        users[2] = new User("Bessonov", "Aleksandrovich", "Henadzi", 51, "lok.orda@mail.ru");
        users[3] = new User("Bessonov", "Aleksandrovich", "Henadzi", 22, "lok.orda@mail.ru");
        users[4] = new User("Bessonov", "Aleksandrovich", "Henadzi", 33, "lok.orda@mail.ru");
        users[5] = new User("Bessonov", "Aleksandrovich", "Henadzi", 45, "lok.orda@mail.ru");
        users[6] = new User("Bessonov", "Aleksandrovich", "Henadzi", 44, "lok.orda@mail.ru");
        users[7] = new User("Bessonov", "Aleksandrovich", "Henadzi", 42, "lok.orda@mail.ru");
        users[8] = new User("Bessonov", "Aleksandrovich", "Henadzi", 40, "lok.orda@mail.ru");
        users[9] = new User("Bessonov", "Aleksandrovich", "Henadzi", 35, "lok.orda@mail.ru");

        for (int i = 0; i < users.length; i++) {
            if (users[i].getYearOfBirth() > 40) {
                System.out.println(users[i].toString());
            }
        }
    }
}

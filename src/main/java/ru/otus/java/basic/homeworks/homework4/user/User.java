package ru.otus.java.basic.homeworks.homework4.user;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String email;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public User(String surname, String patronymic, String name, int yearOfBirth, String email) {
        this.surname = surname;
        this.patronymic = patronymic;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}

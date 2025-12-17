package ru.otus.java.basic.homeworks.homework10.otus.phone_book;

import java.util.Objects;

public class Initials {
    private final String name;
    private final String firstName;
    private final String patronymic;

    public Initials(String name, String firstName, String patronymic) {
        this.name = name;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Initials initials = (Initials) o;
        return Objects.equals(name, initials.name) && Objects.equals(firstName, initials.firstName) && Objects.equals(patronymic, initials.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstName, patronymic);
    }

    @Override
    public String toString() {
        return "Initials{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}

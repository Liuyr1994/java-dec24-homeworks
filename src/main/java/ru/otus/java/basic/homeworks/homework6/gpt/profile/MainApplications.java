package ru.otus.java.basic.homeworks.homework6.gpt.profile;

import java.util.HashSet;
import java.util.Set;

public class MainApplications {
    public static void main(String[] args) {
        Profile profile = new Profile("Henadzi", new Address("Minsk", "Filatova", "15"));
        Profile profile1 = new Profile("Henadzi", new Address("Minsk", "Filatova", "15"));
        Profile profile2 = new Profile("Alesya", new Address("Minsk", "Linkova", "101/1"));
        Profile profile3 = new Profile("Chebyrashka", new Address("Pleschinicy", "Kosmonavtov", "25"));
        Set<Profile> profiles = new HashSet<>();
        profiles.add(profile);
        profiles.add(profile1);
        profiles.add(profile2);
        profiles.add(profile3);
        System.out.println(profiles.size());
    }
}

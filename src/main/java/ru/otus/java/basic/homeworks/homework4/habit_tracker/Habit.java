package ru.otus.java.basic.homeworks.homework4.habit_tracker;

public class Habit {
    private String name;
    private int goalDays;
    private int currentStreak;
    private int bestStreak;

    public String getName() {
        return name;
    }

    public int getGoalDays() {
        return goalDays;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public int getBestStreak() {
        return bestStreak;
    }

    public Habit(String name, int goalDays, int currentStreak, int bestStreak) {
        this.name = name;
        this.goalDays = goalDays;
        this.currentStreak = currentStreak;
        this.bestStreak = bestStreak;
    }

    public void markDone() {
        currentStreak += 1;
        bestStreak += 1;
    }

    public void reset() {
        currentStreak = 0;
    }

    @Override
    public String toString() {
        return "Habit{" +
                "name='" + name + '\'' +
                ", goalDays=" + goalDays +
                ", currentStreak=" + currentStreak +
                ", bestStreak=" + bestStreak +
                '}';
    }
}

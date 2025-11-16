package ru.otus.java.basic.homeworks.homework4.habit_tracker;

public class MainApplication {
    public static void main(String[] args) {
        Habit[] habits = new Habit[5];
        habits[0] = new Habit("smoke", 13, 0, 0);
        habits[1] = new Habit("java", 13, 0, 0);
        habits[2] = new Habit("horizontal bar", 19, 0, 0);
        habits[3] = new Habit("running", 18, 0, 0);
        habits[4] = new Habit("english", 15, 0, 0);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < habits.length; j++) {
                if (Math.random() < 0.5) {
                    habits[j].reset();
                } else {
                    habits[j].markDone();
                }
            }
        }

        Habit habitMaxRecord = habits[0];

        for (int i = 1; i < habits.length; i++) {
            if (habits[i].getBestStreak() > habitMaxRecord.getBestStreak()) {
                habitMaxRecord = habits[i];
            }
        }

        int sumCurrentStreaks = 0;

        for (int i = 0; i < habits.length; i++) {
            sumCurrentStreaks += habits[i].getCurrentStreak();
        }

        System.out.println("Привычка с максимальным рекордом: " + habitMaxRecord.toString());

        for (int i = 0; i < habits.length; i++) {
            if (habits[i].getCurrentStreak() >= (habits[i].getGoalDays() / 2)) {
                System.out.println(habits[i].toString());
            }
        }

        System.out.println("Сумма всех текущих серий: " + sumCurrentStreaks);
    }
}

package ru.otus.java.basic.homeworks.homework8.otus.arrayexceptions;

import ru.otus.java.basic.homeworks.homework8.otus.arrayexceptions.my_exception.AppArrayDataException;
import ru.otus.java.basic.homeworks.homework8.otus.arrayexceptions.my_exception.AppArraySizeException;

public class ArrayProcessor {
    public int sumArrayElements(String[][] arr) {
        if (arr.length != 4) {
            throw new AppArraySizeException("Массив должен быть длинной 4х4");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new AppArraySizeException("Массив должен быть длинной 4х4");
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка данных в ячейке[ " + i + " ][ " + j + "]. Неккоректное значение: " + arr[i][j]);
                }
            }
        }
        System.out.println("Сумма всех элементов равна = " + sum);
        return sum;
    }
}

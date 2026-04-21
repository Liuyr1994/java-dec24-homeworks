package ru.otus.java.basic.homeworks.homework21;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class DataFilter {
    private static final Logger logger = LogManager.getLogger(DataFilter.class.getName());


    public int[] elementsAfterLastOne(int[] arr) {
        if (!isOnlyOnesAndTwos(arr)) {
            logger.warn("Некорректный массив");
            throw new RuntimeException("Некорректный массив");
        }
        int[] array;
        int size = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 1) {
                size++;
            } else {
                break;
            }
        }

        array = Arrays.copyOfRange(arr, arr.length - size, arr.length);
        return array;
    }

    public boolean isOnlyOnesAndTwos(int[] arr) {
        if (arr.length < 2) {
            logger.warn("Длина входного массива не соответствует условию {}", arr.length);
            return false;
        }

        int numberOne = 0;
        int numberTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                numberOne++;
            } else if (arr[i] == 2) {
                numberTwo++;
            } else {
                logger.warn("В массиве присутствуют неликвидные числа - {}, числа должны быть или 1 или 2", Arrays.toString(arr));
                return false;
            }
        }

        return numberOne != 0 && numberTwo != 0;
    }
}

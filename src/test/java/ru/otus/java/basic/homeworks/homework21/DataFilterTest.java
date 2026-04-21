package ru.otus.java.basic.homeworks.homework21;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DataFilterTest {
    DataFilter dataFilter;


    @BeforeEach
    void init() {
        dataFilter = new DataFilter();

    }

    @ParameterizedTest
    @MethodSource("elementsAfterLastOneData")
    void elementsAfterLastOne(int[] arr, int[] result) {
        int[] actualResult = dataFilter.elementsAfterLastOne(arr);
        assertArrayEquals(actualResult, result);
    }

    public static Stream<Arguments> elementsAfterLastOneData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 2}, new int[]{2, 2, 2}),
                Arguments.of(new int[]{1, 2, 2, 2, 2, 2}, new int[]{2, 2, 2, 2, 2}),
                Arguments.of(new int[]{1, 2, 2, 2, 2, 2, 1, 2}, new int[]{2})
        );
    }

    @ParameterizedTest
    @MethodSource("isOnlyOnesAndTwosData")
    void isOnlyOnesAndTwos(int[] arr, boolean isResult) {
        boolean isActualResult = dataFilter.isOnlyOnesAndTwos(arr);
        assertEquals(isActualResult, isResult);
    }

    public static Stream<Arguments> isOnlyOnesAndTwosData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, false),
                Arguments.of(new int[]{1, 2, 2, 2}, true),
                Arguments.of(new int[]{1, 2, 3, 1, 2, 2, 2, 2}, false),
                Arguments.of(new int[]{}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("exceptionData")
    void shouldThrowException(int[] arr) {
        assertThrows(RuntimeException.class, () -> dataFilter.elementsAfterLastOne(arr));
    }

    public static Stream<Arguments> exceptionData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}),
                Arguments.of(new int[]{}),
                Arguments.of(new int[]{2, 2, 2, 2, 2, 2, 2})
        );
    }
}
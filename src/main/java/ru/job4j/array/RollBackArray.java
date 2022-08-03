package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array.length - 1 - index;
            int currentIndex = index;
            result[currentIndex] = array[lastIndex];
        }
        return result;
    }
}

package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 7};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 2, 3, 4, 7};
        int source = 0;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 1, 3, 4, 7};
        assertThat(result).containsExactly(expected);
    }
}
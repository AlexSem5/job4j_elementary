package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort531Then135() {
        int[] data = new int[] {5, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort74325Then() {
        int[] data = new int[] {7, 4, 3, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4, 5, 7};
        assertThat(result).containsExactly(expected);
    }

}
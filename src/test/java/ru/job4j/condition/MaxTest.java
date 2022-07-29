package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To5Then7() {
        int left = 7;
        int right = 5;
        int expected = 7;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(expected);
    }
}
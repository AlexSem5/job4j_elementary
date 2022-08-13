package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax3To5Then5() {
        int first = 3;
        int second = 5;
        int expected = 5;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To5To7Then7() {
        int first = 3;
        int second = 5;
        int third = 7;
        int expected = 7;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To5To7To11Then11() {
        int first = 3;
        int second = 5;
        int third = 7;
        int fourth = 11;
        int expected = 11;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }

}
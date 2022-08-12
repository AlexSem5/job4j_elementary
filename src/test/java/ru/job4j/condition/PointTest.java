package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when11to33then2dot82() {
        Point one = new Point(1, 1);
        Point two = new Point(3, 3);
        double result = one.distance(two);
        double expected = 2.8284271247461903;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when00to20then2() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when10to40then3() {
        Point one = new Point(1, 0);
        Point two = new Point(4, 0);
        double result = one.distance(two);
        double expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}
package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.sum(0, 5));
        System.out.println(Counter.sum(1, 5));
        System.out.println(Counter.sum(2, 5));
        System.out.println(Counter.sum(3, 5));
    }
}
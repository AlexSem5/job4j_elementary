package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {

        int numberOfWeekDay = 0;
        if (name == null) {
            return numberOfWeekDay;
        }

        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thirsday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(MultipleSwitchWeek.numberOfDay("Понедельник"));
        System.out.println(MultipleSwitchWeek.numberOfDay(null));
    }
}

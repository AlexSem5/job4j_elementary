package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static String nameOfDay3(int day) {
        String name = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> {
                System.out.println("Hello Friday");
                yield "Пятница";
            }
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(10));
        System.out.println(nameOfDay3(5));
    }
}




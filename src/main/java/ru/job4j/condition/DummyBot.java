package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Я не знаю. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "Увидимся позже";
        }
        return rsl;
    }
    
    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}

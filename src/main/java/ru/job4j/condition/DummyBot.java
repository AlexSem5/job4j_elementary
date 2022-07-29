package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "It confuses me. Ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, smart man";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later";
        }
        return rsl;
    }
    
    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}

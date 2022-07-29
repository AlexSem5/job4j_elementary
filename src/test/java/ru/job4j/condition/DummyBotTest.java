package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSayByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "Увидимся позже";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSayLoveBot() {
        String in = "Можешь сложить два плюс два";
        String result = DummyBot.answer(in);
        String expected = "Я не знаю. Задайте другой вопрос.";
        assertThat(result).isEqualTo(expected);
    }

}
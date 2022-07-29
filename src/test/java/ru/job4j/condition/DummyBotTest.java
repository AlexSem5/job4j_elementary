package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, smart man";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSayByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSayLoveBot() {
        String in = "I love you, Bot";
        String result = DummyBot.answer(in);
        String expected = "It confuses me. Ask another question.";
        assertThat(result).isEqualTo(expected);
    }

}
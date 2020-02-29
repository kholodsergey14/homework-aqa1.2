package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expectad = 100;
        assertEquals(expectad,actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expectad = 0;
        assertEquals(expectad,actual);
    }

    @Test
    void shouldReturn900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expectad = 900;
        assertEquals(expectad,actual);
    }

    @Test
    void shouldThrowExceptionIfAmountIs0() throws IllegalArgumentException {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        String expected = "amount must be greater than zero";
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            int actual = service.remain(amount);
        });
        assertEquals(expected, thrown.getMessage());
    }

    @Test
    void shouldThrowExceptionIfAmountIsLess0() throws IllegalArgumentException {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        String expected = "amount must be greater than zero";
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            int actual = service.remain(amount);
        });
        assertEquals(expected, thrown.getMessage());
    }
}

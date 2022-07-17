package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldPurchaseLess1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldPurchaseOver1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldPurchase1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
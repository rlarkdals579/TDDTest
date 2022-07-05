package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void 더하기() {
        int rs = Calculator.run("1 + 2");

        assertEquals(3, rs);
    }

    @Test
    public void 더하기_2() {
        int rs = Calculator.run("20 + 20");

        assertEquals(40, rs);
    }

    @Test
    public void 더하기_3() {
        int rs = Calculator.run("10 + 10");

        assertEquals(20, rs);
    }

    @Test
    public void 빼기() {
        int rs = Calculator.run("1 - 2");
        assertEquals(-1, rs);
    }

    @Test
    public void 곱하기() {
        int rs = Calculator.run("1 * 2");
        assertEquals(2, rs);
    }

    @Test
    public void 나누기() {
        int rs = Calculator.run("4 / 2");
        assertEquals(2, rs);
    }

}

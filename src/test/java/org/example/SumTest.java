package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    public void linearSumTest() {
        Sum<LinearFunction> i = new Sum<LinearFunction>(1, 5);
        LinearFunction f = new LinearFunction(1, 3, 0, 6);
        assertEquals(18, i.calculate(f), 0.0001);
    }

    @Test
    public void fractionSumTest() {
        Sum<FractionFunction> i = new Sum<FractionFunction>(1, 5);
        FractionFunction f = new FractionFunction(12, 3, 2, 8, 1, 5);
        assertEquals(7.7857, i.calculate(f), 0.0001);
    }

    @Test
    public void exponentialSumTest() {
        Sum<ExponentialFunction> i = new Sum<ExponentialFunction>(1, 5);
        ExponentialFunction f = new ExponentialFunction(12, 3, 1, 5);
        assertEquals(2063.6037, i.calculate(f), 0.0001);
    }

    @Test
    public void sinSumTest() {
        Sum<SinFunction> i = new Sum<SinFunction>(1, 5);
        SinFunction f = new SinFunction(12, 3, 1, 5);
        assertEquals(14.4423, i.calculate(f), 0.0003);
    }
}
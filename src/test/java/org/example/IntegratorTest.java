package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegratorTest {
    @Test
    public void linearIntegralTest() {
        Integrator<LinearFunction> i = new Integrator<LinearFunction>(1, 5);
        LinearFunction f = new LinearFunction(1, 3, 0, 6);
        assertEquals(24, i.calculate(f), 0.0001);
    }

    @Test
    public void fractionIntegralTest() {
        Integrator<FractionFunction> i = new Integrator<FractionFunction>(1, 5);
        FractionFunction f = new FractionFunction(1, 3, 2, 8, 0, 6);
        assertEquals(1.70611, i.calculate(f), 0.0001);
    }

    @Test
    public void exponentialIntegralTest() {
        Integrator<ExponentialFunction> i = new Integrator<ExponentialFunction>(1, 5);
        ExponentialFunction f = new ExponentialFunction(1, 3, -1, 6);
        assertEquals(157.6851, i.calculate(f), 0.0001);
    }

    @Test
    public void sinIntegralTest() {
        Integrator<SinFunction> i = new Integrator<SinFunction>(1, 5);
        SinFunction f = new SinFunction(5, 3, -1, 6);
        assertEquals(0.3838, i.calculate(f), 0.0003);
    }

}
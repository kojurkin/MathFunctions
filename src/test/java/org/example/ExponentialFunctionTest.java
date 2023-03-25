package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialFunctionTest {
    @Test
    public void OKtest() {
        ExponentialFunction f = new ExponentialFunction(3, 12, 0, 15);
        assertEquals(34.1671, f.getResult(2), 0.0001);
    }

    @Test
    public void badTest() {
        ExponentialFunction f = new ExponentialFunction(10, 25, 0, 15);
        assertThrows(IllegalArgumentException.class, () -> f.getResult(17), "x isn`t belongs to the segment");
    }

}
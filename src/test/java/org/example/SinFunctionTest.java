package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinFunctionTest {
    @Test
    public void OKtest() {
        SinFunction f = new SinFunction(1, 180, 0, 15);
        assertEquals(0.9589, f.getResult(2), 0.0001);
    }

    @Test
    public void badTest() {
        SinFunction f = new SinFunction(10, 25, 0, 15);
        assertThrows(IllegalArgumentException.class, () -> f.getResult(17), "x isn`t belongs to the segment");
    }

}
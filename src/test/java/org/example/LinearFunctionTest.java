package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearFunctionTest {
    @Test
    public void OKtest() {
        LinearFunction f = new LinearFunction(10, 25, 0, 5);
        assertEquals(45, f.getResult(2));
    }

    @Test
    public void badTest() {
        LinearFunction f = new LinearFunction(10, 25, 0, 5);
        assertThrows(IllegalArgumentException.class, () -> f.getResult(14), "x isn`t belongs to the segment");
    }

}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionFunctionTest {
    @Test
    public void OKtest() {
        FractionFunction f = new FractionFunction(10, 25, 15, 0,  0, 5);
        assertEquals(1.5, f.getResult(2));
    }

    @Test
    public void badTest() {
        FractionFunction f = new FractionFunction(10, 25, 15, 43,  0, 5);
        assertThrows(IllegalArgumentException.class, () -> f.getResult(14), "x isn`t belongs to the segment");
    }

}
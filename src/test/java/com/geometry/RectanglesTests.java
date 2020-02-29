package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanglesTests {

    @Test
    void SumPerimeter_32point02() {
        Rectangles rectangles = new Rectangles(2,3, 5.01,6);
        assertEquals(rectangles.SumPerimeter(),32.02, 0.001);
    }
}
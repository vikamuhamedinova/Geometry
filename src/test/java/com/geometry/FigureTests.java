package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureTests {
    @Test
    void isArrayRectanglePlacedMainParallelepiped_1() {
        Figure figures = new Figure(8,7,6);
        figures.Insert(0,2,3);
        figures.Insert(0,4,5);
        assertEquals(figures.IsArrayRectanglePlacedMainParallelepiped(),1);
    }

    @Test
    void isArrayRectanglePlacedMainParallelepiped_0() {
        Figure figures = new Figure(8,7,6);
        figures.Insert(0,2,3);
        figures.Insert(1,9,5);
        assertEquals(figures.IsArrayRectanglePlacedMainParallelepiped(),0);

    }

    @Test
    void isPlacedMainParallelepiped_1() {
        Figure figures = new Figure(8,7,6,5,4,3,2,1);
        assertEquals(figures.isPlacedMainParallelepiped(),1);
    }

    @Test
    void isPlacedMainParallelepiped_0() {
        Figure figures = new Figure(1,2,3,4,5,6,7,8);
        assertEquals(figures.isPlacedMainParallelepiped(),0);
    }
}
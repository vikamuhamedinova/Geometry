package com.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTests {

    @Test
    void init() {
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.Init(2,3);
        Assertions.assertEquals(rectangle.Perimeter(),10 );
    }

    @Test
    void getFirst() {
    }

    @Test
    void getSecond() {
    }

    @Test
    void display() {
    }
}
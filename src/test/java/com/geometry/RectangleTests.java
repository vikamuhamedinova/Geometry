package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTests {

    @Test
    void Perimeter_2and3_10() {
        Rectangle rectangle = new Rectangle();
        rectangle.Init(2,3);
        assertEquals(rectangle.Perimeter(),10, 0.01);
    }

    @Test
    void Perimeter_0and3_Exception() {
        Rectangle rectangle = new Rectangle();
        rectangle.Init(0,3);
        Throwable exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    rectangle.Perimeter();
                });
        assertEquals("The side of the rectangle cannot be less than or equal to zero.", exception.getMessage());
    }

    @Test
    void GetFirst_3() {
        Rectangle rectangle = new Rectangle(3);
        assertEquals(rectangle.GetFirst(),3, 0.01);
    }

    @Test
    void GetSecond_2() {
        Rectangle rectangle = new Rectangle(3,2);
        assertEquals(rectangle.GetSecond(),2, 0.01);
    }

    @Test
    void Better_Rectangle1AndRectangle2_Rectangle1(){
        Rectangle rectangle1 = new Rectangle(3,2);
        Rectangle rectangle2 = new Rectangle(1,2);
        assertEquals(rectangle1.Better(rectangle1,rectangle2),rectangle1);
    }

    @Test
    void Better_Rectangle1AndRectangle2_Rectangle2(){
        Rectangle rectangle1 = new Rectangle(3,2);
        Rectangle rectangle2 = new Rectangle(4,2);
        assertEquals(rectangle1.Better(rectangle1,rectangle2),rectangle2);
    }

    @Test
    void Better_Rectangle_Rectangle(){
        Rectangle rectangle1 = new Rectangle(3,2);
        Rectangle rectangle2 = new Rectangle(4,2);
        assertEquals(rectangle1.Better(rectangle2),rectangle2);
    }

    @Test
    void Better_Rectangle_ThisRectangle(){
        Rectangle rectangle1 = new Rectangle(3,2);
        Rectangle rectangle2 = new Rectangle(1,2);
        assertEquals(rectangle1.Better(rectangle2),rectangle1);
    }
}
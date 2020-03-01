package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelepipedTests {

    @Test
    void Perimeter_0and3and0_Exception() {
        Parallelepiped parallelepiped = new Parallelepiped(0,3, 0);
        Throwable exception =
                assertThrows(IllegalArgumentException.class, () -> {
                    parallelepiped.Perimeter();
                });
        assertEquals("The side of the parallelepiped cannot be less than or equal to zero.", exception.getMessage());
    }

    @Test
    void Perimeter_2and3and4_18() {
        Parallelepiped parallelepiped = new Parallelepiped(2, 3, 4);
        assertEquals(18, parallelepiped.Perimeter(),0.01);
    }

    @Test
    void GetFhird_0() {
        Parallelepiped parallelepiped = new Parallelepiped();
        assertEquals(0, parallelepiped.GetFhird(),0.01);
    }

    @Test
    void toString_2_3_4() {
        Parallelepiped parallelepiped = new Parallelepiped(2, 3, 4);
        assertEquals("2.0  3.0  4.0", parallelepiped.toString());
    }
}
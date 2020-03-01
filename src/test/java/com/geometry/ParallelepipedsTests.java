package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelepipedsTests {

    @Test
    void SumPerimeter_44point6() {
        Parallelepipeds parallelepipeds = new Parallelepipeds(2,3,4,5,6,2.3);
        assertEquals(44.6, parallelepipeds.SumPerimeter(),0.01);
    }
}
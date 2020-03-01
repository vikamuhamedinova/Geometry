package com.geometry;


public class Main {
    public static void main(String[] args) {
        Rectangles a = new Rectangles(5,6,7,8);
        Parallelepipeds b = new Parallelepipeds(5,6,3,7,8,5);
        double p1, p2;
        p1=a.SumPerimeter();
        p2=b.SumPerimeter();
        System.out.printf("%n%f",p1);
        System.out.printf("%n%f",p2);
    }
}

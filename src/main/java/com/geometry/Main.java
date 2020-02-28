package com.geometry;

public class Main {

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        double p;
        a.Init(2,3);
        a.Display();
        p=a.Perimeter();
        System.out.printf(" %f",p);
    }
}

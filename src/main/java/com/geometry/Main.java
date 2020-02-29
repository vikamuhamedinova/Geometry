package com.geometry;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangles a = new Rectangles(5,6,7,8);
        Parallelepipeds b = new Parallelepipeds(5,6,3,7,8,5);
        double p1, p2, p3;
        p1=a.SumPerimeter();
        p2=b.SumPerimeter();
        System.out.printf("\n%f",p1);
        System.out.printf("\n%f",p2);
        /*Geometry a = new Geometry();
        int sr;
        a.Init(14,12.5);
        a.AddResult(3.4, 3);
        a.AddResult(2.5, 3);
        a.AddResult(7.0, 3);
        a.AddResult(5.0, 3);
        a.AddResult(4.0, 3);
        a.Insert(2, 4.5, 2);
        a.Display();
        a.Delete(1);
        a.Display();
        sr=a.Сomparison();
        System.out.printf("%d",sr);
        Geometry ab = new Geometry();
        Rezult b= new Rezult();
        Rectangle c= new Rectangle();
        Rectangle d= new Rectangle();
        Rectangle e= new Rectangle();
        int srt;
        double p1, p2;
        ab.Init(14,12.5,4.5,6,3.5,5);
        c.Init(4, 5);
        d.Init(7, 3);
        p1=c.Perimeter();
        c.Perimeter(b);
        p2=b.param;
        e=c.Better(c, d);
        e=c.Better(d);
        srt=ab.Сomparison();
        e.Display();
        System.out.printf("%d %d %d",srt,p1,p2);*/
    }
}

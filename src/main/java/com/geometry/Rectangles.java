package com.geometry;

class Rectangles implements SumPerimeterFigure{
    protected Rectangle rectangleA;
    protected Rectangle rectangleB;
    public Rectangles(double firstA,double secondA,double firstB,double secondB)
    {
        rectangleA=new Rectangle(firstA,secondA);
        rectangleB=new Rectangle(firstB,secondB);
    }
    public double SumPerimeter()
    {
        return rectangleA.Perimeter()+rectangleB.Perimeter();
    }
}

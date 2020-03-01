package com.geometry;

public class Rectangle {
    protected double first;
    protected double second;
    public Rectangle(double f,double s)
    {
        first=f;
        second=s;
    }

    public Rectangle(double f)
    {
        first=f;
        second=0;
    }

    public Rectangle()
    {
        first=0;
        second=0;
    }

    public void Init(double f,double s)
    {
        first=f;
        second=s;
    }

    public double Perimeter()
    {
        if(first<=0 || second<=0)
            throw new IllegalArgumentException("The side of the rectangle cannot be less than or equal to zero.");
        return first*2+second*2 ;
    }

    public double GetFirst()
    {
        return first;
    }

    public double GetSecond()
    {
        return second;
    }

    public void Display()
    {
        System.out.printf("%f %f",first,second);
    }

    public Rectangle Better(Rectangle a,Rectangle b)
    {
        double p1;
        double p2;
        p1=a.Perimeter();
        p2=b.Perimeter();
        if(p1>p2)
            return a;
        else
            return b;
    }

    public Rectangle Better(Rectangle b)
    {
        double p1;
        double p2;
        p1=this.Perimeter();
        p2=b.Perimeter();
        if(p1>p2)
            return this;
        else
            return b;
    }
}

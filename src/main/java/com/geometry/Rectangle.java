package com.geometry;

public class Rectangle {
    private	double first, second;
    public void Init(double f,double s)
    {	first=f;
        second=s;
    }
    public double Perimeter()
    {	return first*2+second*2 ;
    }
    public double GetFirst()
    {	return first;
    }
    public double GetSecond()
    {	return second;
    }
    public void Display()
    {	System.out.printf("%f %f",first,second);
    }
}

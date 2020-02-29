package com.geometry;

class Parallelepiped extends Rectangle
{	private double fhird;
    public Parallelepiped(double f,double s,double z1)
    {
        super(f,s);
        fhird=z1;
    }

    public Parallelepiped()
    {
        first=0;
        second=0;
        fhird=0;
    }

    public double Perimeter()
    {
        if(first<=0 || second<=0 || fhird<=0)
            throw new IllegalArgumentException("The side of the parallelepiped cannot be less than or equal to zero.");
        return first*2+second*2+fhird*2 ;
    }

    public double GetFhird()
    {
        return fhird;
    }

    public String toString()
    {
        return first+"  "+second+"  "+fhird;
    }
}

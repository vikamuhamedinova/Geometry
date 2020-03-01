package com.geometry;

class Parallelepipeds implements SumPerimeterFigure{
    protected Parallelepiped parallelepipedA;
    protected Parallelepiped parallelepipedB;
    public Parallelepipeds(double firstA,double secondA,double fhirdA,
                           double firstB,double secondB,double fhirdB)
    {
        parallelepipedA=new Parallelepiped(firstA,secondA,fhirdA);
        parallelepipedB=new Parallelepiped(firstB,secondB,fhirdB);
    }
    public double SumPerimeter()
    {
        return parallelepipedA.Perimeter()+ parallelepipedB.Perimeter();
    }
}
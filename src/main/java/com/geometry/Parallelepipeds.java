package com.geometry;

class Parallelepipeds extends SumPerimeterFigure{
    protected Parallelepiped parallelepipedA, parallelepipedB;
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
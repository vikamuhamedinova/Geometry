package com.geometry;

public class Figure{
    final static int N=10;
    private double C, D, E;;
    private Rectangle rectangle;
    private Parallelepiped parallelepiped;
    private Rectangle [] rectangles = new Rectangle[N];
    int n;
    public Figure(double c,double d,double e,double firstR,double secondR,double firstP,double secondP, double fhirdP)
    {	C=c;
        D=d;
        E=e;
        n=0;
        rectangle = new Rectangle(firstR, secondR);
        parallelepiped = new Parallelepiped(firstP, secondP, fhirdP);
    }

    public Figure(double c,double d,double e)
    {	C=c;
        D=d;
        E=e;
        n=0;
    }

    public int IsArrayRectanglePlacedMainParallelepiped()
    {
        double [] first=new double[N];
        double [] second=new double[N];
        int i, f=0;
        for(i=0;i<n;i++)
        {	first[i] = rectangles[i].GetFirst();
            second[i] = rectangles[i].GetSecond();
            if(first[i]<C && second[i]<D)
                f++;
        }
        if(f==n)
            return 1;
        else
            return 0;
    }

    public int isPlacedMainParallelepiped()
    {	double rectangleFirst = rectangle.GetFirst();
        double rectangleSecond = rectangle.GetSecond();
        double parallelepipedFirst = parallelepiped.GetFirst();
        double parallelepipedSecond = parallelepiped.GetSecond();
        double parallelepipedFhird = parallelepiped.GetFhird();
        if(rectangleFirst<C && rectangleSecond<D && parallelepipedFirst<C && parallelepipedSecond<D && parallelepipedFhird<E)
            return 1;
        else
            return 0;
    }
    public void Insert(int k,double f,double s) // вставка результата на место k
    {
        int i;
        for(i=n;i>k;i--)
        {
            rectangles[i] = rectangles[i - 1];
        }
        Rectangle c=new Rectangle();
        c.Init(f, s);
        rectangles[k] = c;
        n++;
    }

    public void AddResult(double f, double s) // добавка результата в конец массива
    {
        Rectangle c = new Rectangle();
        c.Init(f, s);
        rectangles[n] = c;
        n++;
    }

    public void Delete(int k)
    {
        int i;
        for(i = k; i < n-1; i++)
        {
            rectangles[i] = rectangles[i + 1];
        }
        n--;
    }

    public void Display()
    {
        int i;
        System.out.printf("%f %f\n",C,D);
        for (i = 0; i < n; i++)        // вывод всех результатов
        {
            rectangles[i].Display();
        }
    }
}
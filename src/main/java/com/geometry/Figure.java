package com.geometry;

public class Figure{
    static final int N=10;
    private double C;
    private double D;
    private double E;
    private Rectangle rectangle;
    private Parallelepiped parallelepiped;
    private Rectangle [] rectangles = new Rectangle[N];
    int quantity;
    public Figure(double c,double d,double e)
    {	C=c;
        D=d;
        E=e;
        quantity=0;
    }

    public void InitFigure(double firstR,double secondR,double firstP,double secondP, double fhirdP)
    {
        rectangle = new Rectangle(firstR, secondR);
        parallelepiped = new Parallelepiped(firstP, secondP, fhirdP);
    }

    public int IsArrayRectanglePlacedMainParallelepiped()
    {
        double [] first=new double[N];
        double [] second=new double[N];
        int i;
        int f=0;
        for(i=0;i<quantity;i++)
        {	first[i] = rectangles[i].GetFirst();
            second[i] = rectangles[i].GetSecond();
            if(first[i]<C && second[i]<D)
                f++;
        }
        if(f==quantity)
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
        for(i=quantity;i>k;i--)
        {
            rectangles[i] = rectangles[i - 1];
        }
        Rectangle c=new Rectangle();
        c.Init(f, s);
        rectangles[k] = c;
        quantity++;
    }

    public void AddResult(double f, double s) // добавка результата в конец массива
    {
        Rectangle c = new Rectangle();
        c.Init(f, s);
        rectangles[quantity] = c;
        quantity++;
    }

    public void Delete(int k)
    {
        int i;
        for(i = k; i < quantity-1; i++)
        {
            rectangles[i] = rectangles[i + 1];
        }
        quantity--;
    }

    public void Display()
    {
        int i;
        System.out.printf("%f %f%n",C,D);
        for (i = 0; i < quantity; i++)        // вывод всех результатов
        {
            rectangles[i].Display();
        }
    }
}
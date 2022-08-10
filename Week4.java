abstract class Shape{
    int sides;
    Shape(int n)
    {
        sides=n;
    }
    abstract void noOfSides();
}
class triangle extends Shape{
    triangle(int n)
    {
        super(n);
    }
    void noOfSides()
    {
        System.out.println("triangle "+sides);
    }
}
class hexagon extends Shape{
    hexagon(int n)
    {
        super(n);
    }
    void noOfSides()
    {
        System.out.println("hexagon "+sides);
    }
}
class trapezoid extends Shape{
    trapezoid(int n)
    {
        super(n);
    }
    void noOfSides()
    {
        System.out.println("trapezoid "+sides);
    }
}
class Week4{
    public static void main(String args[])
    {
        triangle t=new triangle(3);
        t.noOfSides();
        trapezoid t1=new trapezoid(4);
        t1.noOfSides();
        hexagon h=new hexagon(6);
        h.noOfSides();
    }
}
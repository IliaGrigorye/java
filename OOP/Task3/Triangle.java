package OOP.Task3;

public class Triangle extends Figure {
    
    private int a;
    private int b;
    private int c;

    public int getA(){ return a;}
    public int getB(){ return b;}
    public int getC(){ return c;}

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double area(){
        Double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p-c));
    }

    @Override
    public Double perimeter(){
        return (a + b + c) * 1.0;
    }

}

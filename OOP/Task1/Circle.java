package OOP.Task1;

public class Circle extends Figure{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int area(){
        return (int)Math.PI * radius * radius;
    }
}

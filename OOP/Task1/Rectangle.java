package OOP.Task1;

public class Rectangle extends Figure{
    private int lenght;
    private int width;
    public Rectangle(int lenght, int width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public int area(){
        return lenght*width;
    }
}

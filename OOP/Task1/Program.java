package OOP.Task1;

public class Program {
    private static void printFigureInfo(Figure figure) {
        System.out.println(figure.getClass().getName() + " has area: " + figure.area());
    }

    public static void main(String[] args) {
        Figure figure = new Figure();
        Rectangle rectangle = new Rectangle(3, 5);
        Circle circle = new Circle(3);
        printFigureInfo(circle);
        printFigureInfo(figure);
        printFigureInfo(rectangle);
    }
}
    
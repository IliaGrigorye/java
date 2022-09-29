package OOP.Task2;

public class Program {
    public static void main(String[] args) {

        // Vechicle myVechicle = new Vechicle();

        Car myCar = new Car("Красный", "Волга", 4, 1000, 190);
        Truck myTruck = new Truck("Черный", "КАМАЗ", 6, 3000, 110);
        Moto myMoto = new Moto("Синний", "KAWASAKI", 2, 100, 250);
        Bicycle myBicycle = new Bicycle("Зеленый", "Мип", 3, 20, 10);
    
        printVechicleInfo(myCar);
        printVechicleInfo(myTruck);
        printVechicleInfo(myMoto);
        printVechicleInfo(myBicycle);

    }

    

    private static void printVechicleInfo(Vechicle myVechicle) {
        System.out.println(myVechicle.getClass().getName() + " Параметры Т/С:\n"
        +"Цвет: " + myVechicle.getColor()
        +"\nМодель: " + myVechicle.getModels()
        +"\nКол-во колес: " + myVechicle.getWheels()
        +"\nВес: " + myVechicle.getWeight()
        +"\nСкорость: " + myVechicle.getSpeed());
        myVechicle.ride();
        System.out.println("----------------------");
    }
}

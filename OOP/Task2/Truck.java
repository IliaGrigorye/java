package OOP.Task2;

public class Truck extends Vechicle {
    public Truck(String color, String models, int wheels, int weight, int speed){
        this.color = color;
        this.models = models;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public void ride(){
        System.out.println("DRRRRRRR");
    }

}

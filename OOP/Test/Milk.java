package OOP.Test;

//Молоко
public class Milk extends Product {

    public Milk(String title, int price, int quantity, String unit, String volume, int fat, String expimilk, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.volume = volume; //объем жидкости
        this.fat = fat; //жирность для молока
        this.expimilk = expimilk; //срок годности молоко
        this.index = index;
    }
}

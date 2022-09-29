package OOP.Test;

//Лимонад
public class Lemonade extends Product {
    
    public Lemonade(String title, int price, int quantity, String unit, String volume, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.volume = volume; //объем жидкости
        this.index = index;
    }
}

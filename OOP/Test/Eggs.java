package OOP.Test;

//Яйца
public class Eggs extends Product {

    public Eggs(String title, int price, int quantity, String unit, String expi, int quantitypackeeg, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.expi = expi;//срок годности
        this.quantitypackeeg = quantitypackeeg; //кол-во в упаковке яиц
        this.index = index;
    }

}

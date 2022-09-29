package OOP.Test;

//Маски
public class Mask extends Product {
    
    public Mask(String title, int price, int quantity, String unit, int quantitypack, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.quantitypack = quantitypack;//кол-во в упаковке
        this.index = index;
    }
}

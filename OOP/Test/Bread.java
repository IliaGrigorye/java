package OOP.Test;

//Хлеб
public class Bread extends Product{

    public Bread(String title, int price, int quantity, String unit, String expi, String flour, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.expi = expi;//срок годности
        this.flour = flour;//тип муки;
        this.index = index;
    }

}

package OOP.Test;

//Соска
public class Nipple extends Product{
    
    public Nipple(String title, int price, int quantity, String unit, int minage, String hypoallerg, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.minage = minage; //минимальный возраст
        this.hypoallerg = hypoallerg; //Гипоаллергенность
        this.index = index;
    }
}

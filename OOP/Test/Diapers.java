package OOP.Test;

//Подгузник
public class Diapers extends Product{

    public Diapers(String title, int price, int quantity, String unit, int minage, String hypoallerg, int size, int minweight, int maxweight, String type, int  index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.minage = minage; //минимальный возраст
        this.hypoallerg = hypoallerg; //Гипоаллергенность
        this.size = size;//размер подгузников
        this.minweight = minweight;//минимальный вес подгузников
        this.maxweight = maxweight;//максимальный вес подгузников
        this.type = type;//тип подгузника
        this.index = index;
    }
}

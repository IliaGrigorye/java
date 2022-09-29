package OOP.Test;

//Товары
public class Product {

    protected String title; //Название
    protected int price; //Цена
    protected int quantity; //кол-во
    protected String unit; //единица измерения
    protected int index; //номер
    protected String volume; //объем жидкости
    protected int fat; //жирность для молока
    protected String expimilk; //срок годности молоко
    protected int quantitypackeeg; //кол-во в упаковке яиц
    protected String flour; //тип муки;
    protected String expi;//срок годности
    protected int quantitypack;//кол-во в упаковке
    protected int quantitylayers; //кол-во слоев бумаги
    protected int minage; //минимальный возраст
    protected String hypoallerg; //Гипоаллергенность
    protected int size; //размер подгузников
    protected int minweight; //минимальный вес подгузников
    protected int maxweight; //максимальный вес подгузников
    protected String type; //тип подгузника

    public int getMinage(){
        return minage;
    }
    public String getHypoallerg(){
        return hypoallerg;
    }
    public int getSize(){
        return size;
    }
    public int getMinweight(){
        return minweight;
    }
    public int getMaxweight(){
        return maxweight;
    }
    public String getType(){
        return type;
    }
    public int getQuantitypack(){
        return quantitypack;
    }
    public int getQuantitylayers(){
        return quantitylayers;
    }
    public String getExpi(){
        return expi;
    }
    public String getFlour(){
        return flour;
    }
    public int getQuantitypackeeg(){
        return quantitypackeeg;
    }
    public String getVolume(){
        return volume;
    }
    public int getFat(){
        return fat;
    }
    public String getExpimilk(){
        return expimilk;
    }
    public String getTitle(){
        return title;
    }   
    public int getPrice(){
        return price;
    }   
    public int getQuantity(){
        return quantity;
    }   
    public String getUnit(){
        return unit;
    }   
}

package OOP.Test;

//Туалетная бумага
public class ToiletPaper extends Product{
    
    public ToiletPaper(String title, int price, int quantity, String unit, int quantitylayers, int quantitypack, int index){
        this.title = title; //Название
        this.price = price; //Цена
        this.quantity = quantity; //кол-во
        this.unit = unit; //единица измерения
        this.quantitypack = quantitypack;//кол-во в упаковке
        this.quantitylayers = quantitylayers;//кол-во слоев бумаги
        this.index = index;
    }
}

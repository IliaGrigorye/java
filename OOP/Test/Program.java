package OOP.Test;

public class Program {
    public static void main(String[] args) {
        Bread myBread = new Bread("Белый хлеб", 50, 30, "Штуки", "15 дней", "Высший сорт", 1);
        Eggs myEggs = new Eggs("Куриные яйца", 120, 15, "Ячейки", "1 месяц", 10, 2);
        Milk myMilk = new Milk("Молоко Буренка", 80, 40, "Бутылки", "1 литр", 5, "7 дней", 3);
        Lemonade myLemonade = new Lemonade("Лимонад Ситро", 40, 20, "Бутылки", "1 литр", 4);
        Diapers myDiapers = new Diapers("Подгузники детские", 150, 30, "Штуки", 3, "Нулевая", 15, 4, 12, "Детские", 5);
        Nipple myNipple = new Nipple("Соска Муня", 80, 15, "Штуки", 1, "Нулевая",6);
        Mask myMask = new Mask("Мед.Маска", 30, 100, "Упаковка", 10, 7);
        ToiletPaper myToiletPaper = new ToiletPaper("Туалетная бумага", 15, 50, "Упаковка", 3, 6, 8);

        printProductInfo(myBread);
        printProductInfo(myEggs);
        printProductInfo(myMilk);
        printProductInfo(myLemonade);
        printProductInfo(myDiapers);
        printProductInfo(myNipple);
        printProductInfo(myMask);
        printProductInfo(myToiletPaper);
    }

    // protected String title; //Название
    // protected int price; //Цена
    // protected int quantity; //кол-во
    // protected String unit; //единица измерения

    private static void printProductInfo(Product myProduct){
        System.out.println(myProduct.getClass().getName() + "\n"
        +"Наименование: " + myProduct.getTitle()
        +"\nЦена: " + myProduct.getPrice()
        +"\nКол-во: " + myProduct.getQuantity()
        +"\nЕдиница измерения: " + myProduct.getUnit());
        if (myProduct.index == 1){
            System.out.println("Срок годности: " + myProduct.getExpi()
            +"\nТип муки: " + myProduct.getFlour()
            +"\n-----------------------------");
        }
        if (myProduct.index == 2){
            System.out.println("Срок годности: " + myProduct.getExpi()
            +"\nКол-во яийц в ячейке: " + myProduct.getQuantitypackeeg()
            +"\n-----------------------------");
        } 
        if (myProduct.index == 3){
            System.out.println("Срок годности молока: " + myProduct.getExpimilk()
            +"\nОбъем: " + myProduct.getVolume()
            +"\nЖироность: " + myProduct.getFat()
            +"\n-----------------------------");
        } 
        if (myProduct.index == 4){
            System.out.println("Объем: " + myProduct.getVolume()
            +"\n-----------------------------");
        }
        if (myProduct.index == 5){
            System.out.println("Минимальный возраст: " + myProduct.getMinage()
            +"\nГипоаллергенность: " + myProduct.getHypoallerg()
            +"\nРазмер: " + myProduct.getSize()
            +"\nМинимальный вес подгузников: "+ myProduct.getMinweight()
            +"\nМаксимальный вес подгузников: "+ myProduct.getMaxweight()
            +"\nТип подгузников: "+ myProduct.getType()
            +"\n-----------------------------");
        }
        if (myProduct.index == 6){
            System.out.println("Минимальный возраст: " + myProduct.getMinage()
            +"\nГипоаллергенность: " + myProduct.getHypoallerg()
            +"\n-----------------------------");
        }
        if (myProduct.index == 7){
            System.out.println("Кол-во штук в упаковке: " + myProduct.getQuantitypack()
            +"\n-----------------------------");
        }
        if (myProduct.index == 8){
            System.out.println("Кол-во штук в упаковке: " + myProduct.getQuantitypack()
            +"\nкол-во слоев бумаги: " + myProduct.getQuantitylayers()
            +"\n-----------------------------");
        }
    }
}

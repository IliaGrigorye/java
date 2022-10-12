package Classes;

import Interface.WildAnimals;

public class Tiger extends AnimalClass implements WildAnimals {
    @Override
    public void height() {
        System.out.println("height: 150 cm");
    }

    @Override
    public void weight() {
        System.out.println("weight: 70 kg");
    }

    @Override
    public void eyeColor() {
        System.out.println("eye color: black");
    }

    @Override
    public void sound() {
        System.out.println("sound: Rrrrrrrrr");
    }

    @Override
    public void habitat() {
        System.out.println("habitat: Africa");
    }

    @Override
    public void dateOfLocation() {
        System.out.println("date of location: 01.05.1532");
    }
}

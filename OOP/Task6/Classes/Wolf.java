package Classes;

import Interface.WildAnimals;

public class Wolf extends AnimalClass implements WildAnimals {
    @Override
    public void height() {
        System.out.println("height: 100 cm");
    }

    @Override
    public void weight() {
        System.out.println("weight: 60 kg");
    }

    @Override
    public void eyeColor() {
        System.out.println("eye color: black");
    }

    @Override
    public void sound() {
        System.out.println("sound: Ayyyyyy");
    }

    @Override
    public void habitat() {
        System.out.println("habitat: Taiga");
    }

    @Override
    public void dateOfLocation() {
        System.out.println("date of location: 21.10.1465");
    }

    public void packLeader(){
        System.out.println("pack leader: no");
    }
}

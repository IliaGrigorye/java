package Classes;

import Interface.HomeAnimals;

public class Cat extends AnimalClass implements HomeAnimals {
    @Override
    public void height() {
        System.out.println("height: 30 cm");
    }

    @Override
    public void weight() {
        System.out.println("weight: 15 kg");
    }

    @Override
    public void eyeColor() {
        System.out.println("eye color: green");
    }

    @Override
    public void sound() {
        System.out.println("sound: meyy");
    }

    @Override
    public void nickname() {
        System.out.println("nickname: Boris");
    }

    @Override
    public void breed() {
        System.out.println("breed: Maine Coon");
    }

    @Override
    public void vaccinations() {
        System.out.println("vaccinations: have");
    }

    @Override
    public void coatColor() {
        System.out.println("coat color: black");
    }

    @Override
    public void dateOfBirth() {
        System.out.println("date of birth: 15.12.98");
    }

    public void presenceOfWool() {
        System.out.println("presence of wool: have");
    }
}

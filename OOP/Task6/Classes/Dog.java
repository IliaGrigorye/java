package Classes;

import Interface.HomeAnimals;

public class Dog extends AnimalClass implements HomeAnimals {
    @Override
    public void height() {
        System.out.println("height: 50 cm");
    }

    @Override
    public void weight() {
        System.out.println("weight: 30 kg");
    }

    @Override
    public void eyeColor() {
        System.out.println("eye color: blue");
    }

    @Override
    public void sound() {
        System.out.println("sound: gaw gaw");
    }

    @Override
    public void nickname() {
        System.out.println("nickname: Charly");
    }

    @Override
    public void breed() {
        System.out.println("breed: Colli");
    }

    @Override
    public void vaccinations() {
        System.out.println("vaccinations: have");
    }

    @Override
    public void coatColor() {
        System.out.println("coat color: white");
    }

    @Override
    public void dateOfBirth() {
        System.out.println("date of birth: 10.03.2002");
    }

    public void availabilityOfTraining() {
        System.out.println("availability of training: have");
    }

}

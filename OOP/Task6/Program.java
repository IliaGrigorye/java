import Classes.*;
import Interface.HomeAnimals;
import Interface.WildAnimals;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        AnimalClass cat = new Cat();
        AnimalClass dog = new Dog();
        AnimalClass tiger = new Tiger();
        AnimalClass wolf = new Wolf();

        ArrayList<AnimalClass> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(wolf);

        for (AnimalClass item : animalList){
            animalsMethod(item);
        }

    }

    public static void animalsMethod(AnimalClass animal){
        System.out.printf("\n It's a %s: \n", animal.getClass().getSimpleName());
        /**Height, weight, eye color, sound**/
        animal.height();
        animal.weight();
        animal.eyeColor();
        animal.sound();

        if(animal instanceof HomeAnimals){
            HomeAnimals homeAnimals = (HomeAnimals) animal;
            /**Nickname, breed, vaccinations, coat color, date of birth**/
            homeAnimals.nickname();
            homeAnimals.breed();
            homeAnimals.vaccinations();
            homeAnimals.coatColor();
            homeAnimals.dateOfBirth();

            if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.availabilityOfTraining();
            }

            if(animal instanceof Cat){
                Cat cat = (Cat) animal;
                cat.presenceOfWool();
            }
        }

        if (animal instanceof WildAnimals){
            WildAnimals wildAnimals = (WildAnimals) animal;
            /** habitat, date of location**/
            wildAnimals.habitat();
            wildAnimals.dateOfLocation();
            if(animal instanceof Wolf){
                Wolf wolf = (Wolf) animal;
                wolf.packLeader();
            }

        }
    }
}

/*
 * Java_1 Homework 6
 * @author Kalabekov Soslan
 * @date 22/10/2021
 */

package Homework;

public class Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Matroskin", 200, 0);
        Dog dog = new Dog("Sharik", 500, 10);
        System.out.println(cat.Run(110));
        System.out.println(cat.Run(210));
        System.out.println(cat.Swim(10));
        System.out.println(dog.Run(250));
        System.out.println(dog.Run(550));
        System.out.println(dog.Swim(10));
        System.out.println(dog.Swim(15));
        }
    }

class Cat extends Animal {
    Cat(String name, double animalDistanceRun, double animalDistanceSwim) {
        super(name, animalDistanceRun, animalDistanceSwim);
    }

    @Override
    public String Run(int distanceRunCat) {
        if (distanceRunCat > getAnimalDistanceRun()) return getName() + " can't run " + distanceRunCat + " meters";
            return  getName() + " ran " + distanceRunCat;
    }

    @Override
    public String Swim(int distanceSwimCat) {
        return getName() + " can't swim";
    }
}

class Dog extends Animal {
    Dog(String name, double animalDistanceRun, double animalDistanceSwim) {
        super(name, animalDistanceRun, animalDistanceSwim);
    }

    @Override
    public String Run(int distanceRunDog) {
        if (distanceRunDog > getAnimalDistanceRun()) return getName() + " can't run " + distanceRunDog + " meters!";
        return getName() + " ran " + distanceRunDog;
    }

    @Override
    public String Swim(int distanceSwimDog) {
        if (distanceSwimDog > getAnimalDistanceSwim()) return getName() + " can't swim " + distanceSwimDog + " meters!" ;
        return getName() + " swim " + distanceSwimDog + " meters!";
    }
}

interface IAnimal {
    String Run(int a);
    String Swim(int a);
}

abstract class Animal implements IAnimal {
    private String name;
    private double animalDistanceRun;
    private double animalDistanceSwim;

    Animal(String name, double animalDistanceRun, double animalDistanceSwim) {
        this.name = name;
        this.animalDistanceRun = animalDistanceRun;
        this.animalDistanceSwim = animalDistanceSwim;
    }

    String getName() {
        return name;
    }

    double getAnimalDistanceRun() {
        return animalDistanceRun;
    }

    double getAnimalDistanceSwim() {
        return animalDistanceSwim;
    }
}




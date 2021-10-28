/*
 * Java_1 Homework 7
 * @author Kalabekov Soslan
 * @date 28/10/2021
 */

public class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Matroskin", 400), new Cat("Leopold", 500), new Cat("Tom", 300)};
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        Plate plate = new Plate(1100);
        System.out.println(plate);
        System.out.println("Cats start to eat");

        for (Cat2 cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

          plate.increaseFood();

        System.out.println("Cats are starting to eat again");
        for (Cat2 cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullnes;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullnes = false;

    }

    void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            System.out.println("Not enough food for the cat " + name);
        }
        else {
            plate.decreaseFood(appetite);
            fullnes = true;
        }
    }

    @Override
    public  String toString() {
        return "Cat " + name + ", eat: " + appetite + " grams "  + " " +  " Fullnes: " + fullnes;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    int getFood() {
        return food;
    }

    int decreaseFood(int appetite) {
        if (appetite <= food)
            return this.food -= appetite;
        return food;
    }

    int increaseFood() {
        this.food += 1500;
        System.out.println("On the plate reported 1500 grams");
        return food;
    }

    @Override
    public  String toString() {
        return "Now in the plate: " + food + " grams";
    }
}

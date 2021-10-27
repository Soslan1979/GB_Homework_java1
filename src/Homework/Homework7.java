package Homework;

public class Homework7 {
    public static void main(String[] args) {
        Cat2 catMatroskin = new Cat2("Matroskin", 6);
        System.out.println(catMatroskin);
        Cat2 catLeopold = new Cat2("Leopold", 4);
        System.out.println(catLeopold);
        Cat2 catTom = new Cat2("Tom", 3);
        System.out.println(catTom);

        Plate plate = new Plate(12);
        System.out.println(plate);

        catMatroskin.eat(plate);
        catLeopold.eat(plate);
        catTom.eat(plate);
        System.out.println(plate);
        plate.increaseFood();
        System.out.println(plate);

        catMatroskin.eat(plate);
        catLeopold.eat(plate);
        catTom.eat(plate);
        System.out.println(plate);
    }
}

class Cat2 {
    private String name;
    private int appetite;
    private int satiety;

    Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;

    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }


    void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    @Override
    public  String toString() {
        return "Cat " + name + ", eat: " + appetite + " " + satiety;
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
        this.food += 15;
        System.out.println("On the plate reported 15");
        return food;
    }

    @Override
    public  String toString() {
        return "Plate: " + food;
    }
}

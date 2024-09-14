import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.swim(11);
        cat1.run(11);
        Cat.getCatCount();

        Dog dog1 = new Dog();
        dog1.swim(10);
        dog1.run(501);
        Dog.getDogCount();

        Animal.getAnimalCount();

        Cat[] catArray = new Cat[5];
        Dish dish1 = new Dish(35);


        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat();
            catArray[i].feedCat(dish1, ThreadLocalRandom.current().nextInt(1, 56));
        }


        Triangle triangle = new Triangle(11, 8, 4, "синий", "белый");
        triangle.printInfoAboutFigure();
        Rectangle rectangle = new Rectangle(1, 3, "зеленый", "желтый");
        rectangle.printInfoAboutFigure();
        Round round = new Round(1, "красный", "оранжевый");
        round.printInfoAboutFigure();

    }


}


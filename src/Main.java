
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
        Dish.addMealToDish(35);
        for (int i = 0; i < catArray.length; i++) {
            catArray[i] = new Cat();
            catArray[i].feedCat(ThreadLocalRandom.current().nextInt(1, 56));
        }

        CalculatingArea figureRound = new CalculatingArea();
        CalculatingArea figureRectangle = new CalculatingArea();
        CalculatingArea figureTriangle = new CalculatingArea();

        figureRound.AllInfoFigure(1, "красный", "оранжевый");
        figureRectangle.AllInfoFigure(1, 3, "зеленый", "желтый");
        figureTriangle.AllInfoFigure(11, 8, 4, "синий", "белый");


    }


}


public class Dish {

    private int countMealInDish;

    public Dish(int countMeal) {
        countMealInDish = countMeal;
    }

    public void addMealToDish(int countMeal) { // добавить еду в миску
        countMealInDish += countMeal;
    }

    public void info() {
        System.out.println("Count meal in dish:" + countMealInDish);
    }

    public boolean isEnoughMealInDish(int countOfFood) {
        if (countMealInDish - countOfFood >= 0) {
            countMealInDish = countMealInDish - countOfFood;
            return true;
        } else return false;
    }


}

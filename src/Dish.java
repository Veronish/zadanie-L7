public class Dish {

    private static int countMealInDish = 15;

    public static void addMealToDish(int countMeal) { // добавить еду в миску
        countMealInDish = countMealInDish+countMeal;
    }

    public static boolean feedCat(int countOfFood) {
        if (countMealInDish - countOfFood >= 0) {
            countMealInDish = countMealInDish - countOfFood;
            return true;
        } else return false;
    }

}

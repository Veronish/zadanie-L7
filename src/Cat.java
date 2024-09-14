public class Cat extends Animal {

    private static int catCount;

    public boolean satiety;//сытость

    public void isSatiety() { //кот голодный или нет
        if (this.satiety) {
            System.out.println("Cat is full");
        } else System.out.println("Cat still hungry");
    }

    @Override
    public void swim(int meters) {
        System.out.println("Cats can't swim!");
    }

    @Override
    public void run(int meters) {
        if (meters <= 200) {
            System.out.println("Cat run " + meters + " meters");
        } else System.out.println("Cat can't run " + meters + " meters");
    }

    public Cat() {
        catCount++;
    }

    public static void getCatCount() {
        System.out.println("Total cats created: " + catCount);
    }

    public void feedCat(Dish dish, int countOfFood) {
        // System.out.println(countOfFood); // посмотреть сколько получилось значение еды
        if (dish.isEnoughMealInDish(countOfFood)) {
            this.satiety = true;

        }
        isSatiety();

    }


}

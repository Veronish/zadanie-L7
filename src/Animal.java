public abstract class Animal {
    private static int animalCount;

    public void run(int meters) {
        System.out.println("Animal run " + meters + " meters");
    }

    public void swim(int meters) {
        System.out.println("Animal swim " + meters + " meters");
    }

   public Animal() {
        animalCount++;
    }

    public static void getAnimalCount() {
        System.out.println("Total animals created: " + animalCount);
    }

}

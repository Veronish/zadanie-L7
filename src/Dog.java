public class Dog extends Animal {

    private static int dogCount;

    @Override
    public void swim(int meters) {
        if (meters <= 10) {
            System.out.println("Dog swim " + meters + " meters");
        } else System.out.println("Dog can't swim " + meters + " meters");
    }

    @Override
    public void run(int meters) {
        if (meters <= 500) {
            System.out.println("Dog run " + meters + " meters");
        } else System.out.println("Dog can't run " + meters + " meters");
    }

    public Dog() {
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println("Total dog created:: " + dogCount);
    }

}

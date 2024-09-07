public class Cat extends Animal {
    String name;

    @Override
    public void swim(int meters) {
        System.out.println("Cats can't swim!");
    }

    @Override
    public void run(int meters) {
        if (meters < 200) {
            System.out.println("Cat " + name + "run " + meters + "distantion");
        } else System.out.println("Cat " + name + "can't run " + meters + "distantion");
    }

}

public class Dog extends Animal {
    String name;

    @Override
    public void swim(int meters) {
        if (meters < 10) {
            System.out.println("Dog " + name + "swim " + meters + "distantion");
        } else System.out.println("Dog " + name + "can't swim " + meters + "distantion");
    }

    @Override
    public void run(int meters) {
        if (meters < 500) {
            System.out.println("Dog " + name + "run " + meters + "distantion");
        } else System.out.println("Dog " + name + "can't run " + meters + "distantion");
    }

}

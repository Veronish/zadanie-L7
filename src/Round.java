import static java.lang.StrictMath.PI;

public class Round implements CalculateArea {
    private double radius;
    private String colorArea;
    private String colorPerimeter;

    public Round(double radius, String colorArea, String colorPerimeter) {
        this.radius = radius;
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("\nПериметр круга: " + calculatePerimeter());
        System.out.println("\nПлощадь круга: " + calculateArea());
        System.out.println("\nЦвет заливки: " + colorArea + " цвет границы: " + colorPerimeter);
    }
}

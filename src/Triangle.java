public class Triangle implements CalculateArea {

    private double a, b, c;
    private String colorArea;
    private String colorPerimeter;

    public Triangle(double a, double b, double c, String colorArea, String colorPerimeter) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("\nПериметр треугольника: " + calculatePerimeter());
        System.out.println("\nПлощадь треугольника: " + calculateArea());
        System.out.println("\nЦвет заливки: " + colorArea + " цвет границы: " + colorPerimeter);

    }
}

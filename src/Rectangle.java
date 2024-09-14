public class Rectangle implements CalculateArea {

    private double length, width;
    private String colorArea;
    private String colorPerimeter;

    public Rectangle(double length, double width, String colorArea, String colorPerimeter) {
        this.length = length;
        this.width = width;
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printInfoAboutFigure() {
        System.out.println("\nПериметр прямоугольника: " + calculatePerimeter());
        System.out.println("\nПлощадь прямоугольника: " + calculateArea());
        System.out.println("\nЦвет заливки: " + colorArea + " цвет границы: " + colorPerimeter);
    }
}

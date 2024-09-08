import static java.lang.StrictMath.PI;

public class CalculatingArea {
    String colorArea;
    String colorPerimeter;

    public void CalculatePerimeter(double radius) { //периметр круга
        System.out.println("\nПериметр круга: ");
        System.out.print(2 * PI * radius);
    }

    public void CalculateArea(double radius) { //Площадь круга
        System.out.println("\nПлощадь круга: ");
        System.out.print(PI * (radius * radius));
    }

    public void CalculatePerimeter(double length, double breadth) { //периметр прямоугольника
        System.out.println("\nПериметр прямоугольника: ");
        System.out.print(2 * (length + breadth));
    }

    public void CalculateArea(double length, double breadth) { //Площадь прямоугольника
        System.out.println("\nПлощадь прямоугольника: ");
        System.out.print(length * breadth);
    }

    public void CalculatePerimeter(double a, double b, double c) { //периметр треугольника
        System.out.println("\nПериметр треугольника: ");
        System.out.print(a + b + c);
    }

    public void CalculateArea(double a, double b, double c) { //Площадь треугольника
        System.out.println("\nПлощадь треугольника: ");
        double pp = (a + b + c) / 2;
        double s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        System.out.print(s);
    }

    public void AllInfoFigure(double radius, String colorArea, String colorPerimeter) {
        System.out.println("\nУ выбранной фигуры цвет границ " + colorPerimeter + ", цвет фона " + colorArea + ", и их значения: ");
        CalculateArea(radius);
        CalculatePerimeter(radius);
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;

    }

    public void AllInfoFigure(double length, double breadth, String colorArea, String colorPerimeter) {
        System.out.println("\nУ выбранной фигуры цвет границ " + colorPerimeter + ", цвет фона " + colorArea + ", и их значения: ");
        CalculateArea(length, breadth);
        CalculatePerimeter(length, breadth);
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;

    }

    public void AllInfoFigure(double a, double b, double c, String colorArea, String colorPerimeter) {
        System.out.println("\nУ выбранной фигуры цвет границ " + colorPerimeter + ", цвет фона " + colorArea + ", и их значения: ");
        CalculateArea(a, b, c);
        CalculatePerimeter(a, b, c);
        this.colorArea = colorArea;
        this.colorPerimeter = colorPerimeter;

    }


}

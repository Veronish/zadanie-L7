public interface CalculateArea {

    double calculatePerimeter();

    double calculateArea();

    default void printInfoAboutFigure() {
        System.out.println("\nПериметр фигуры: " + calculatePerimeter());
        System.out.println("\nПлощадь фигуры: " + calculateArea());
        ;
    }


}

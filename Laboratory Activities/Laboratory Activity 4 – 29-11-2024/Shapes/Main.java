public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(10, 10);
        Triangle triangle = new Triangle(15, 18, 13);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}

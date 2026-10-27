public class Main4 {
    public static void main(String[] argv) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        rectangle.moveTo(4,7);
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(new Point(2, 2), new Point(5, 8));
        System.out.println(rectangle3);

        Rectangle rectangle4 = new Rectangle(new Segment(new Point(2, 2), new Point(5, 8)));
        System.out.println(rectangle4);

        Point puntoInferiorIzquierdo = rectangle4.getPoint();
        System.out.println("El punto inferior izquierdo de rectangle4 es: " + puntoInferiorIzquierdo);
    }
}
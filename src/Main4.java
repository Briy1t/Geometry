public class Main4 {
    public static void main(String[] argv) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        rectangle.moveTo(4,7);
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(new Point(2, 0), new Point(4, 2));
        System.out.println(rectangle3);

        Rectangle rectangle4 = new Rectangle(new Segment(new Point(2, 2), new Point(4, 0)));
        System.out.println(rectangle4);

        Rectangle r5= new Rectangle(new Point(5,6),6,8);
        System.out.println("Arriba-Izquierda" + r5.getTopLeftPoint() + " Arriba_Derecha" +
                r5.getTopRightPoint() + " Abajo_izquierda: " + r5.getBottomRightPoint() +
                "Abajo-Derecha: " + r5.getBottomRightPoint());
    }
}
public class MainPolygon {
    public static void main(String[] args){
        Point[] points = new Point[4];
        points[0] = new Point(3, 4);
        points[1] = new Point(2, 8);
        points[2] = new Point(5,6);
        points[3] = new Point(1,5);

        Polygon p= new Polygon(points);
        System.out.println(p);
        System.out.println(p.getLength());
        p.setOffset(5,5);
        System.out.println(p);
    }
}

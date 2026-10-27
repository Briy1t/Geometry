public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point point, int newWidth, int newHeight) {
        super(point.getX(), point.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Segment segment) {
        super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();

        if (startPoint.getX() < endPoint.getX()) {
            x = startPoint.getX();
            width = endPoint.getX() - startPoint.getX();
        } else {
            x = endPoint.getX();
            width = startPoint.getX() - endPoint.getX();
        }

        if (startPoint.getY() < endPoint.getY()) {
            y = startPoint.getY();
            height = endPoint.getY() - startPoint.getY();
        } else {
            y = endPoint.getY();
            height = startPoint.getY() - endPoint.getY();
        }
        setX(x);
        setY(y);
    }



    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p1.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    @Override
    public String toString() {

        return "(" + getX() + ", " + getY() + ") width: " + width + " height: " + height;
    }

    public int getArea() {
        return width * height;
    }

    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public Point getTopLeftPoint(){
        return new Point(getX(), getY() + height);
    }

    public Point getTopRightPoint(){
        return new Point(getX()+ width, getY() +height);
    }

    public Point getBottomRightPoint(){
        return new Point(getX() + width, getY());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(){
        startPoint=new Point();
        endPoint=new Point();
    }

    public Segment(Point startPoint, Point endPoint){
        this.startPoint=startPoint;
        this.endPoint=endPoint;
    }

    public double getModulo(){
        double c1,c2;
        double result;
        c1= startPoint.getX()- endPoint.getX();
        c2= startPoint.getY()- endPoint.getY();
        double module = Math.sqrt(c1 * c1 + c2 * c2);
        return module;
    }

    @Override // redefine, es opcional .
    public String toString(){
        return startPoint+ "- " + endPoint;
    }


}






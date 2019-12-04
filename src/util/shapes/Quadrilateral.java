package util.shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    abstract void setLength(double n);
    abstract void setWidth( double n);

    public Quadrilateral(double len, double wid){
        length = len;
        width = wid;
    }
}

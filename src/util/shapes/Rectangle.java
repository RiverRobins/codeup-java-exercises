package util.shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public void setLength(double n){
        super.length = n;
    }
    public void setWidth(double n){
        super.width = n;
    }
    public double getPerimeter(){
        return (super.length * 2) + (super.width * 2);
    }
    public double getArea(){
        return super.length * super.width;
    }
    public Rectangle(double len, double wid){
        super(len, wid);
    }

//    protected double len;
//    protected double wid;
//
//    Rectangle(double lengthP, double widthP){
//        len = lengthP;
//        wid = widthP;
//    }
//    public double getArea(){
//        return len * wid;
//    }
//    public double getPerimeter(){
//        return (len * 2) + (wid * 2);
//    }
}

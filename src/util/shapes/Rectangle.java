package util.shapes;

public class Rectangle {
    protected double len;
    protected double wid;
    Rectangle(double lengthP, double widthP){
        len = lengthP;
        wid = widthP;
    }
    public double getArea(){
        return len * wid;
    }
    public double getPerimeter(){
        return (len * 2) + (wid * 2);
    }
}

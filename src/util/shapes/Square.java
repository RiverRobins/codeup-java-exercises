package util.shapes;

public class Square extends Rectangle {
    Square(double side){
        super(side, side);
    }
    public double getArea(){
        return len * len;
    }
    public double getPerimeter(){
        return len * 4;
    }
}

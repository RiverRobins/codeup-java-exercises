package util.shapes;

public class Square extends Quadrilateral {
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

    Square(double side){
        super(side, side);
    }
//    public double getArea(){
//        return len * len;
//    }
//    public double getPerimeter(){
//        return len * 4;
//    }
}

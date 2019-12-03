package util.shapes;

public class ShapesTest {
    public static void main(String[] args){
        //box1
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        //box2
        Square box2 = new Square(5);
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());
    }
}

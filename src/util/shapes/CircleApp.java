package util.shapes;

import util.Input;

import javax.xml.bind.SchemaOutputResolver;

public class CircleApp {
    private double radius;
    private byte circles;

    public CircleApp(double r){
        this.radius = r;
        this.circles++;
    }
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }
    public double getCircumference(){
        return (2 * Math.PI * this.radius);
    }

    public static void main(String[] args){
        Input userIn = new Input();
        boolean keepGoing = true;
        do {
            System.out.println("Enter a number to make a circle and get the area:");
            CircleApp newCircle = new CircleApp(userIn.getDouble());

            System.out.println("Area: " + newCircle.getArea());
            System.out.println("Circumference: " + newCircle.getCircumference());
            System.out.println("");

            keepGoing = userIn.yesNo();
            if (!keepGoing){
//                System.out.println("Number of circles made: " + newCircle.circles);
            }
        } while (keepGoing);
    }
}

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int myFavoriteNumber = 123;//123L; //3.14;//2520;
        float myNumber = (float) 3.14;
        String myString = "string";//3.14159; //"string";

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        int x = 4;
        x += 5;

        int x2 = 3;
        int y2 = 4;
        y2 *= x2;

        int x3 = 10;
        int y3 = 2;
        x3 /= y3;
        y3 -= x3;

        Byte bigByteOfBorg = 127;
        bigByteOfBorg++;
        System.out.println(bigByteOfBorg);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
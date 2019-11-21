import java.lang.reflect.Array;
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


        double pi = 3.14159;
        System.out.printf("In math, pi is %.3f%n",pi);

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Enter an integer");
        int inNum = scanner.nextInt();
        System.out.println(inNum);

        scanner.nextLine();
        System.out.println("Enter 3 things");
        String in = scanner.nextLine();
        String inArray[] = in.split(" ");
//        System.out.println(inArray);

        String word1 = inArray[0];
        String word2 = inArray[1];
        String word3 = inArray[2];

        System.out.printf("You entered %s, %s, and %s", inArray[0], inArray[1], inArray[2]);

        System.out.println("");

        System.out.println("Enter length and width in the format (L W)");
        String metrics = scanner.nextLine();
        String inMetrics[] = metrics.split(" ");

        float length = Float.parseFloat(inMetrics[0]);
        float width = Float.parseFloat(inMetrics[1]);
        System.out.printf("Area is %s. Perimeter is %s", (length * width),((length * 2) + (width * 2)));

    }
}
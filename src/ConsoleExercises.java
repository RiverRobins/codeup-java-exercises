import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
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

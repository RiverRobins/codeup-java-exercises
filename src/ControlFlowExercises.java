import java.lang.reflect.Method;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        //Lecture refactor

//        boolean outOfPizzaRolls = false;
//        boolean outOfPepsi = true;
//
//        if (!outOfPizzaRolls && !outOfPepsi) {
//            System.out.println("Night ruined");
//        }
//        else if (outOfPepsi ^ outOfPizzaRolls) {
//            System.out.println("Night meh");
//        }
//        else {
//            System.out.println("Night good");
//        }

        //Actual Exercises

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("\n");


        Integer num = 100;
        while (num >= -10){
            System.out.print(num + " ");
            num -= 5;
        }

        num = 0;
        do {
            System.out.println(num);
            num += 2;
        } while (num >= 100);

        num = 0;
        for (int i = 100; i > -10; i -= 5) {
            System.out.println(i);
        }
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

        String prompt;
        do {

            System.out.println("Enter a Number to see squares");
            num = scanner.nextInt();
            scanner.nextLine();
            System.out.println("You chose the number " + num);

            String output = "number  |  squared  |  cubed \n";

            for (int i = 0; i <= num; i++) {
                String template = "%s  |  %s  |  %s \n";
                output += (String.format(template, i, i * i, i * i * i));
            }
            System.out.print(output);
            System.out.println("You would like to continue? Enter yes or no");
            prompt = scanner.nextLine();
        } while (!prompt.equalsIgnoreCase("yes"));

        System.out.println("Enter a numeric grade");
        byte grade = Byte.parseByte(scanner.nextLine());

        if (grade > 98){
            System.out.println("A+");
        }
        else if(grade > 93){
            System.out.println("A");
        }
        else if (grade > 90) {
            System.out.println("A-");
        }
        else if (grade > 88) {
            System.out.println("B+");
        }
        else if (grade > 83) {
            System.out.println("B");
        }
        else if (grade > 80){
            System.out.println("B-");
        }
        else if (grade > 78){
            System.out.println("C+");
        }
        else if (grade > 74){
            System.out.println("C");
        }
        else if (grade > 70){
            System.out.println("C-");
        }
        else {
            System.out.println("F");
        }
    }
}

import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
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

        System.out.println("Enter a Number to see squares");
        num = scanner.nextInt();
        scanner.nextLine();

        System.out.println(num);
    }
}

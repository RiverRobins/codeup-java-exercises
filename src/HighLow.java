import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static double rand(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return Math.floor(x);
    }

    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("A random number has been generated between 1 and 100, try to guess it!");
            Integer num = (int) Math.round( rand(1, 100) );
            int userIn = -1;
            do {
                userIn = Integer.parseInt(scanner.nextLine());
                if (userIn == num) {
                    System.out.println("You won!");
                }
                else {
                    if (userIn > num) {
                        System.out.println("Lower");
                    } else if (userIn < num) {
                        System.out.println("Higher");
                    }
                }
            } while (userIn != num);
            System.out.println("Play again? Y or N");
            String cont = scanner.next();
            if (cont == "N"){
                break;
            }
        }
    }
}

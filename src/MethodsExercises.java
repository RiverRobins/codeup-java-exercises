import com.sun.org.apache.bcel.internal.generic.DCONST;

import java.sql.Array;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }

    public static int mult(int a, int b){
        //return a * b;
        return mult(a, b - 1, a);
    }
    public static int mult(int a, int b, int stay){
        if (!(b <= 0)){
            return mult(a + stay, b - 1, stay);
        }
        else {
            return a;
        }
    }

    public static int div(int a, int b){
        return a / b;
    }
    public static int mod(int a, int b){
        return a % b;
    }

    public static boolean testRange(int start, int end, int in){
        if (in > start && in < end){
            return true;
        }
        else {
            return false;
        }
    }

    public static double rand(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return Math.floor(x);
    }

    public static void main(String[] args){
        System.out.println(add(3, 5));
        System.out.println(sub(5, 1));
        System.out.println(mult(2, 5));
        System.out.println(div(99, 11));
        System.out.println(mod(10, 3));

        Scanner scanner = new Scanner(System.in);

        int num = 5;

        testRange(1, 10, num);

        int userIn = 0;

        while (testRange(1, 10, userIn)) {
            System.out.println("Enter a number between 1 and 10: ");
            userIn = Integer.parseInt(scanner.next());
            int lock = userIn;
            for (int i = 1; i < lock; i++) {
                userIn *= i;
            }
            System.out.println(userIn);
        }
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            double dice = rand(1, 6);
            System.out.println(dice);
        }
    }
}
//java.util.Random
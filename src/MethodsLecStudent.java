// remove this first line

import java.util.Scanner;

public class MethodsLecStudent {

//  METHODS

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */
    public static void orderFood(){
        System.out.println("I wont frize");
    }
    public static void orderFood(String food){
        System.out.println("I wont " + food);
    }
    public static void orderFood(Byte am, String food){
        System.out.println("I wont " + am + " " + food);
    }
    public static void orderFood(String food, Byte am){
        System.out.println("I wont frize");
    }

/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */


/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */
    public static void favoriteSong(){
        System.out.println("So Far Away - Nickleback");
    }


/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */
    public static void weeksIn(){
        System.out.println("10 Weeks!");
    }


//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */


//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()

    public static void fib(int n){
        int prev = 0;
        int temp = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(num);
            temp = num;
            num += prev;
            prev = temp;
        }
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            fib(scanner.nextInt());
        }
    }
}
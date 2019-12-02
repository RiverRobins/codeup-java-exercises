//import java.util.Arrays;
//
//import java.lang.reflect.Array;

import util.Input;

import java.util.Random;

public class ArraysExercises {

    public static class Person{
        String first;
        String last;
        Person(String n, String m){
            this.first = n;
            this.last = m;
        }
    }

    public static class serverName{
        String[] adj = {"Bolty", "Chill", "Threatening", "Massive", "Blue", "Hiding", "Lunging", "Gentle", "Bratty", "Terrifying"};
        String[] noun = {"Smithi", "Avic", "Blondi", "Sazimai", "Anax", "Vagans", "Minax", "Uataman", "Regalis", "Pulchra"};
        String first;
        String last;
        serverName(){
            this.first = adj[randInt(1, adj.length)];
            this.last = noun[randInt(1, adj.length)];
        }
    }

    public static Person[] addPerson(Person[] arr, Person newP){
        Person[] temp = new Person[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = newP;
        return temp;
    }

    public static int randInt(int min, int max){
        return Integer.parseInt ("" + Math.round(min + (Math.random() + 1) * (max - min) - max) );
    }

    public static class movieArray{
        private static String[] animated = {"Flashpoint Paradox", "Clone Wars", "Batman: Hush"};
        private static String[] drama = {"The Notebook", "Joker", "The Revenant"};
        private static String[] horror = {"IT", "Scream", "SAW"};
        private static String[] scifi = {"Star Wars: Empire Strikes Back", "Lord of the Rings: Return of the King", "Space Balls"};

        public static void all(){
            for (String i : movieArray.animated){
                System.out.println(i);
            }
            for (String i : movieArray.drama){
                System.out.println(i);
            }
            for (String i : movieArray.horror){
                System.out.println(i);
            }
            for (String i : movieArray.scifi){
                System.out.println(i);
            }
        }
        public static void printAnimated(){
            for (String i : movieArray.animated){
                System.out.println(i);
            }
        }
        public static void printDrama(){
            for (String i : movieArray.drama){
                System.out.println(i);
            }
        }
        public static void printHorror(){
            for (String i : movieArray.horror){
                System.out.println(i);
            }
        }
        public static void printSciFi(){
            for (String i : movieArray.scifi){
                System.out.println(i);
            }
        }
    }

    public static void menuMain(){
        System.out.print("What would you like to do?\n" +
                "0 - Exit\n" +
                "1 - View all movies\n" +
                "2 - View movies by genre\n");
    }
    public static void menuGenre(){
        System.out.println("Select genre or go back to main menu:\n" +
                "0 - Exit\n" +
                "1 - Back to main menu\n" +
                "2 - Animated\n" +
                "3 - Drama\n" +
                "4 - Horror\n" +
                "5 - Sci-Fi/Fantasy");
    }

    public static void main(String[] args){
        Person[] people = {new Person("John", "Smith"), new Person("Chad", "Alpha"), new Person("Smith", "John")};
        Person[] newList = addPerson(people, new Person("New", "Person"));
        for (Person item : people){
            System.out.print(item.first + " " + item.last + "\n");
        }
        System.out.println("===========");
        for (Person item : newList){
            System.out.print(item.first + " " + item.last + "\n");
        }
        System.out.println("===========");

        serverName name = new serverName();

        System.out.println("Your server name is: " + name.first + "-" + name.last);


        Input input = new Input();

//        boolean cont = true;
//
//        while (cont){
//            menuMain();
//            int n = input.getInt();
//            switch (n){
//                case 0
//                :{
//                    cont = false;
//                    break;
//                }
//                case 1: {
//                    movieArray.all();
//                    break;
//                }
//                case 2: {
//                    menuGenre();
//                    switch (input.getInt()){
//                        case 0: {
//                            cont = false;
//                        }
//                        case 1: {
//                            break;
//                        }
//                        case 2:{
//                            movieArray.printAnimated();
//                            break;
//                        }
//                        case 3:{
//                            movieArray.printDrama();
//                            break;
//                        }
//                        case 4:{
//                            movieArray.printHorror();
//                            break;
//                        }
//                        case 5:{
//                            movieArray.printSciFi();
//                            break;
//                        }
//                    }
//                    break;
//                }
//            }
//        }

    }
}

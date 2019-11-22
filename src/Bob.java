import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.endsWith("!")){
                System.out.println("Chill bruh");
            }
            else if (input.endsWith("?")){
                System.out.println("Sure bro");
            }
            else if (input.isEmpty()){
                System.out.println("Be that way.");
            }
            else if (input.equalsIgnoreCase("true")){
                System.out.println("Epstien didn't kill himself.");
            }
            else {
                System.out.println("whatever man");
            }
        }
    }
}

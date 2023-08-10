import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to Haley's Fortune Tellings!");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nTo continue to your fortune, press 1");
        int cont = sc.nextInt();

        if (cont != 1) {
            System.out.println("Thank you for stopping by!");
        }

        else {
            System.out.println("Please select a number between 1 and 10");
            int fortNum = sc.nextInt();

            if (fortNum >= 1 && fortNum <= 10) {
                System.out.println("Yes!");
            }

            else {
                System.out.println("Please select a number between 1 and 10");
                while (fortNum < 1 && fortNum > 10) {
                    System.out.println("Sorry please pick a number between 1 and 10");
                }
            }
        }
    }
}

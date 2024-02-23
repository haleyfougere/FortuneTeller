import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to Haley's Fortune Tellings!");

        String[] fortunes = {
            "Good things come to those who wait. Be patient!",
            "Adventure is worthwhile in itself. Embrace the unknown.",
            "A dream you dream alone is only a dream. A dream you dream together is reality.",
            "Courage is not the absence of fear, but the triumph over it.",
            "Now is the time to try something new.",
            "Your ability to juggle many tasks will take you far.",
            "A friend asks only for your time, not your money.",
            "You will make a close friend when you least expect it.",
            "Success is a journey, not a destination. Enjoy the trip!",
            "The greatest risk is not taking one."
        };
        


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
                System.out.println(fortunes[fortNum - 1]);
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

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // User Input
        double trainingPrice = Integer.parseInt(scan.nextLine());

        // Calculations
        double basketballTrainers = trainingPrice - trainingPrice * 40 / 100;
        double basketballSuit = basketballTrainers - basketballTrainers * 20 / 100;
        double basketBall = basketballSuit * 1 / 4;
        double basketballAccessories =  basketBall * 1 / 5;

        double result = trainingPrice + basketballTrainers + basketballSuit + basketBall + basketballAccessories;
        System.out.println(result);

    }
}
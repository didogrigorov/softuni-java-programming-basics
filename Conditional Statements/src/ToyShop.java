import java.util.Scanner;
public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user inputs
        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzleNumber = Integer.parseInt(scanner.nextLine());
        int dollsNumber = Integer.parseInt(scanner.nextLine());
        int bearsNumber = Integer.parseInt(scanner.nextLine());
        int minionsNumber = Integer.parseInt(scanner.nextLine());
        int trucksNumber = Integer.parseInt(scanner.nextLine());

        //  Toys prices
        double puzzle = 2.60;
        double doll = 3.00;
        double bear = 4.10;
        double minion = 8.20;
        double truck = 2.00;

        double totalToysSum = puzzle * puzzleNumber + doll * dollsNumber + bear * bearsNumber + minion * minionsNumber + truck * trucksNumber;
        int allToys = puzzleNumber + dollsNumber + bearsNumber + minionsNumber + trucksNumber;

        if(allToys >= 50)
            totalToysSum -= totalToysSum * 0.25;

        totalToysSum -= totalToysSum * 0.10;

        if (totalToysSum >= tourPrice)
            System.out.printf("Yes! %.2f lv left.%n", totalToysSum - tourPrice);
        else
            System.out.printf("Not enough money! %.2f lv needed.%n", tourPrice - totalToysSum);

    }
}

import java.util.Scanner;

public class Shopping{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramModules = Integer.parseInt(scanner.nextLine());

        // Prices
        double videoCardPrice = 250.0;
        double processorPricePercentage = 0.35; // 35% of videoCardPrice
        double ramPricePercentage = 0.10; // 10% of videoCardPrice

        // Calculate total prices
        double totalVideoCardPrice = videoCards * videoCardPrice;
        double totalProcessorPrice = processors * (totalVideoCardPrice * processorPricePercentage);
        double totalRamPrice = ramModules * (totalVideoCardPrice * ramPricePercentage);
        double totalPrice = totalVideoCardPrice + totalProcessorPrice + totalRamPrice;

        // Apply discount if videoCards > processors
        if (videoCards > processors) {
            double discount = 0.15; // 15%
            double discountAmount = totalPrice * discount;
            totalPrice -= discountAmount;
        }

        // Check if budget is sufficient
        if (budget >= totalPrice) {
            double remainingBudget = budget - totalPrice;
            System.out.printf("You have %.2f leva left!", remainingBudget);
        } else {
            double neededAmount = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededAmount);
        }
    }
}

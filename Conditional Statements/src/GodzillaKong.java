import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // user inputs
        double movieBudget = Double.parseDouble(scan.nextLine());
        int statistsNum = Integer.parseInt(scan.nextLine());
        double clothesPrice = Double.parseDouble(scan.nextLine());

        // numbers calculation
        double decorsPrice = movieBudget * 0.10;
        double clothesTotalPrice = statistsNum * clothesPrice;

        if(statistsNum > 150)
            clothesTotalPrice -= clothesTotalPrice * 0.10;

        double totalSumNeeded = decorsPrice + clothesTotalPrice;

        if(totalSumNeeded <= movieBudget){
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.%n", movieBudget - totalSumNeeded);
        } else {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.%n", Math.abs(movieBudget - totalSumNeeded));
        }
    }
}

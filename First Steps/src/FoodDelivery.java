import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Prices
        double chicken = 10.35;
        double fish = 12.40;
        double vegan = 8.15;
        double delivery = 2.50;

        // User Input
        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenus = Integer.parseInt(scan.nextLine());
        int veganMenus = Integer.parseInt(scan.nextLine());

        double foodWithoutDessert = chickenMenus * chicken + fishMenus * fish + vegan * veganMenus;
        double dessert = foodWithoutDessert * 20 / 100;
        System.out.println(foodWithoutDessert + dessert + delivery);

    }
}
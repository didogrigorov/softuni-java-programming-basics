import java.util.Scanner;
public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // fixed prices
        double nylon = 1.50;
        double decoration = 14.50;
        double paintThinner = 5.00;
        double bagsPrice = 0.40;

        // User Input
        double nylonNeeded = Double.parseDouble(scan.nextLine());
        double decorationNeeded = Double.parseDouble(scan.nextLine());
        double paintThinnerNeeded = Double.parseDouble(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        double resultMaterials = (nylonNeeded + 2) * nylon + (decorationNeeded + decorationNeeded * 10/100) * decoration + paintThinner * paintThinnerNeeded + bagsPrice;
        double meisters = (resultMaterials * 30 / 100) * hours;
        double allcosts = resultMaterials + meisters;
        System.out.println(allcosts);

    }
}
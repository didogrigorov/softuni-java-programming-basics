import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // user input
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        // result
        double volume = length * width * height;
        double liters = volume / 1000;
        double result = liters - liters * percentage / 100;
        System.out.println(result);

    }
}

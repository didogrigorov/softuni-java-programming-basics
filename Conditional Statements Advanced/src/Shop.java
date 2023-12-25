import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double productQuantity = Double.parseDouble(scanner.nextLine());
        double totalSum = 0.0;

        if("Sofia".equals(city)){
            if("coffee".equals(product)){
                totalSum = 0.50 * productQuantity;
            } else if ("water".equals(product)) {
                totalSum = 0.80 * productQuantity;
            } else if ("beer".equals(product)) {
                totalSum = 1.20 * productQuantity;
            } else if ("sweets".equals(product)) {
                totalSum = 1.45 * productQuantity;
            } else if ("peanuts".equals(product)) {
                totalSum = 1.60 * productQuantity;
            }
        } else if("Plovdiv".equals(city)) {
            if("coffee".equals(product)){
                totalSum = 0.40 * productQuantity;
            } else if ("water".equals(product)) {
                totalSum = 0.70 * productQuantity;
            } else if ("beer".equals(product)) {
                totalSum = 1.15 * productQuantity;
            } else if ("sweets".equals(product)) {
                totalSum = 1.30 * productQuantity;
            } else if ("peanuts".equals(product)) {
                totalSum = 1.50 * productQuantity;
            }
        } else if ("Varna".equals(city)) {
            if("coffee".equals(product)){
                totalSum = 0.45 * productQuantity;
            } else if ("water".equals(product)) {
                totalSum = 0.70 * productQuantity;
            } else if ("beer".equals(product)) {
                totalSum = 1.10 * productQuantity;
            } else if ("sweets".equals(product)) {
                totalSum = 1.35 * productQuantity;
            } else if ("peanuts".equals(product)) {
                totalSum = 1.55 * productQuantity;
            }

        }
        System.out.println(totalSum);
    }
}

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositedSum = Double.parseDouble(scan.nextLine());
        double depositedPeriod = Double.parseDouble(scan.nextLine());
        double annualInterestRate = Double.parseDouble(scan.nextLine());

        double interest = depositedSum * annualInterestRate / 100; // 11.40
        double monthlyRate = interest / 12; //11.40 / 12
        double fullSum = depositedSum + (depositedPeriod * monthlyRate);
        System.out.println(fullSum);
    }
}
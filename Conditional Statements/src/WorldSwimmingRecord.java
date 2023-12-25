import java.util.Scanner;

public class WorldSwimmingRecord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни данни
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        // Изчисления
        double ivanTime = distance * timePerMeter;
        double resistanceTime = Math.floor(distance / 15) * 12.5; // Закръгляме надолу до най-близкото цяло число

        double totalTime = ivanTime + resistanceTime;

        // Проверка дали е подобрил рекорда
        if (totalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n", totalTime);
        } else {
            double secondsSlower = totalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", secondsSlower);
        }
    }
}

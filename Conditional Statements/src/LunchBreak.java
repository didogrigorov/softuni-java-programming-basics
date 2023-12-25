import java.util.Scanner;
import java.lang.Math;

public class LunchBreak{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        // Calculate break details
        double lunchTime = breakDuration * 1.0 / 8;
        double restTime = breakDuration * 1.0 / 4;
        double totalTimeNeeded = episodeDuration + lunchTime + restTime;

        // Check if there is enough time
        if (totalTimeNeeded <= breakDuration) {
            int remainingTime = (int) Math.ceil(breakDuration - totalTimeNeeded);
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",
                    seriesName, remainingTime);
        } else {
            int neededTime = (int) Math.ceil(totalTimeNeeded - breakDuration);
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",
                    seriesName, neededTime);
        }
    }
}


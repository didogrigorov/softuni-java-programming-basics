import java.util.Scanner;
public class VacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pagesNumber = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysNum = Integer.parseInt(scan.nextLine());

        int totalTime = pagesNumber / pagesPerHour;
        int hoursPerDay = totalTime / daysNum;
        System.out.println(hoursPerDay);
    }
}

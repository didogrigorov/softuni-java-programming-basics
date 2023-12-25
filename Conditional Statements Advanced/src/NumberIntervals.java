import java.util.Scanner;

public class NumberIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = Integer.parseInt(scanner.nextLine());

        if(userNumber > 0 && userNumber <= 100)
            System.out.println("Yes");
        else if (userNumber >= -100 && userNumber < -1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

import java.util.Scanner;

public class MrMrs {
    public static void main(String[] args) {
        // User Inputs
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if("f".equals(gender)) {
            if(age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else if ("m".equals(gender)) {
            if (age < 16) {
                System.out.println("Master");
            } else {
                System.out.println("Mr.");
            }

        }


    }
}

import java.util.Scanner;

public class SuppliesForSchool{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int penPacket = Integer.parseInt(scan.nextLine());
        int markersPackets = Integer.parseInt(scan.nextLine());
        int whiteboardCleaner = Integer.parseInt(scan.nextLine());
        int discount = Integer.parseInt(scan.nextLine());


        double pens = 5.80;
        double markers = 7.20;
        double cleanerperliter = 1.20;



        double result = (pens * penPacket + markers * markersPackets + cleanerperliter * whiteboardCleaner) - (pens * penPacket + markers * markersPackets + cleanerperliter * whiteboardCleaner) * discount / 100;
        System.out.println(result);

    }
}
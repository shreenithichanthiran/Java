import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int generalPassengers = s.nextInt();
        int generalFare = s.nextInt();
        int acPassengers = s.nextInt();
        int acFare = s.nextInt();
        int platformCollection = s.nextInt();
        int maintenanceCost = s.nextInt();
        int fuelCost = s.nextInt();
        int revenue =generalPassengers * generalFare+ acPassengers * acFare + platformCollection- maintenanceCost- fuelCost;
        System.out.println(revenue);

    }
}

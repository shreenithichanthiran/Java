import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int weight = s.nextInt();
        int rate = s.nextInt();
        int priority = s.nextInt();
        int insurance = s.nextInt();
        int handling = s.nextInt();
        int fuel = s.nextInt();
        int  revenue = weight * rate + priority + insurance - handling - fuel;
        System.out.println(revenue);
    }
}

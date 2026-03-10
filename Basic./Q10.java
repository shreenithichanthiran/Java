import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deliver = scan.nextInt();
        int payout = scan.nextInt();
        int incentive = scan.nextInt();
        int fuel = scan.nextInt();
        int earning = deliver*payout+incentive-fuel;
        System.out.println(earning);
    }
}

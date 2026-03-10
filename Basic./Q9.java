import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int room = s.nextInt();
        int days =s. nextInt();
        int medicine = s.nextInt();
        int labfees = s.nextInt ();
        int insurance = s.nextInt();
        int bill = room*days+medicine+labfees-insurance;
        System.out.println(bill);
    }
}

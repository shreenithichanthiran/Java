import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ticket = a.nextInt();
        int snack = a.nextInt();
        int maintenance = a.nextInt();
        int electric = a.nextInt();
        int profit = ticket+snack-maintenance-electric;
        System.out.println(profit);
        
    }
}

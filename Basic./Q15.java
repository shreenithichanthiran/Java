import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int rooms = a.nextInt();
        int price = a.nextInt();
        int service = a.nextInt();
        int commission = a.nextInt();
        int revenue = rooms*price+service-commission;
        System.out.println(revenue);
    }
}

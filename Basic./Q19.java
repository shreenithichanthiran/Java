import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int days= a.nextInt();
        int rent = a.nextInt();
        int late = a.nextInt();
        int fuel = a.nextInt();
        int maintenance = a.nextInt();
        int profit = days* rent + late - fuel - maintenance;
        System.out.println(profit);
    }
}

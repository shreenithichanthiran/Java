import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int base = e.nextInt();
        int sessions = e.nextInt();
        int payper = e.nextInt();
        int bouns = e.nextInt();
        int maintenance = e.nextInt();
        int salary = base+sessions*payper+bouns-maintenance;
        System.out.println(salary);
    }
}

import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int  distance =s.nextInt();
        int rate = s.nextInt();
        int maintenance = s.nextInt();
        int driver = s.nextInt();
        int subsidy = s.nextInt();
        int transport = distance*rate+maintenance+driver-subsidy;
        System.out.println(transport);
    }
}

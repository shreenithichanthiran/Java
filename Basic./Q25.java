import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resUsage = s.nextInt();
        int resRate = s.nextInt();
        int comUsage = s.nextInt();
        int comRate = s.nextInt();
        int connection = s.nextInt();
        int penalty = s.nextInt();
        int maintenance = s.nextInt();
        int treatment= s.nextInt();
        int revenue =  (resUsage * resRate) + (comUsage * comRate) + connection + penalty - maintenance - treatment;
        System.out.println(revenue);
    }
}

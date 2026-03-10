import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daywork = scan.nextInt();
        int wageper = scan.nextInt();
        int overtime = scan.nextInt();
        int mainten = scan.nextInt();
        int sum = daywork*wageper;
        int cal = sum+overtime;
        int total = cal-mainten;
        System.out.println(total);
    }
}

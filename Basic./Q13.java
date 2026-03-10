import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner c = new Scanner (System.in);
        int yield = c.nextInt();
        int acres = c.nextInt();
        int extra = c.nextInt();
        int damaged = c.nextInt();
        int total = yield*acres+extra-damaged;
        System.out.println(total);
    }
}

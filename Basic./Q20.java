import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int ads =s.nextInt();
        int sponsor = s.nextInt();
        int affiliate = s.nextInt();
        int tax = s.nextInt();
        int production = s.nextInt();
        int incom = ads+sponsor+affiliate-tax-production;
        System.out.println(incom);
    }
}

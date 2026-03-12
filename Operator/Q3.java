import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        int percentage = scan.nextInt();
        boolean result = (40<hours)&&(90<percentage);
        if(result) System.out.println("Eligible");
        if(!result) System.out.println("Not Eligible");
    }
}

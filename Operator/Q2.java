import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int balance = s1.nextInt();
        int withdrawal = s1.nextInt();
        int dailylimit = s1.nextInt();
        boolean result = (withdrawal<= balance) && (withdrawal<=dailylimit);
        if(result) System.out.println("Approved");
        if(!result) System.out.println("Declined");
    }
    
}

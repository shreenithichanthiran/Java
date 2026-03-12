import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int purchase = s.nextInt();
        int cardblock = s.nextInt();
        boolean result = (purchase<=limit)&&(cardblock==0);
        if(result) System.out.println("Approved");
        if(!result) System.out.println("Declined");
    }
    
}

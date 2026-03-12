import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int salary = s.nextInt();
        int score = s.nextInt();
        boolean reslut = (25000<salary)&& (700<score);
        if(reslut) System.out.println("Approved");
        if(!reslut) System.out.println("Rejected");
    }
}

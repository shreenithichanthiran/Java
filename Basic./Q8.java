import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);  
        int rodsper = s.nextInt();
        int hoursworked = s.nextInt();
        int overtime = s.nextInt();
        int reject = s.nextInt();
        int finalpro = rodsper*hoursworked +overtime-reject;
        System.out.println(finalpro); 
    }
}

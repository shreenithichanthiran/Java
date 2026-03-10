import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int developer = s.nextInt();
        int hourly = s.nextInt();
        int design = s. nextInt();
        int testing = s. nextInt();
        int advance = s. nextInt();
        int project = developer*hourly+design+testing-advance;
        System.out.println(project);
    }
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b >= 45 && b < 60) {
            b -= 45;

        } else if (b < 45 && b >= 0 && a > 0) {
            a -= 1;
            b = b-45+60;

        } else if (b < 45 && b >= 0 && a == 0) {
            a = 23;
            b = b-45+60;
        }
        System.out.print(a + " " + b);
    }
}

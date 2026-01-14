import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        if(a>=1 && a<=s.length()) {
            char c = s.charAt(a-1);
            System.out.println(c);
        }
    }
}

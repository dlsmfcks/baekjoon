import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String result = "";
        for(int i=0; i<a; i++) {
            String s = sc.nextLine();
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length()-1);
            result += "" + c1 + c2 + "\n";
        }
        System.out.println(result);
    }
}

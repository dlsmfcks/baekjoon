import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){
            int a = 0;
            int b = 0;
            String s = sc.next();
            for(int j = 0; j < s.length(); j++){
                if (s.charAt(j) == 'O') {
                    a++;
                    b += a;
                } else {
                    a = 0;
                }
            }
            System.out.println(b);
        }
    }
}

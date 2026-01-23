import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int floor;
            int room;

            if(c % a == 0) {
                floor = a;
                room = c / a;
            } else {
                floor = c % a;
                room = c / a + 1;
            }
            System.out.println(floor * 100 + room);
        }
    }
}

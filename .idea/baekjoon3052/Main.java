import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] brr = new int[10];

        int a = 0;

        for(int i=0;i<10;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++) {
            brr[i] = arr[i] % 42;

            boolean is = true;
            for(int j=0;j<i;j++) {
                if(brr[i] == brr[j]) {
                    is = false;
                }
            }
            if(is) {
                a++;
            }
        }
        System.out.println(a);
    }
}

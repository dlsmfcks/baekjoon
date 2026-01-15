import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int c = 0;
        int[] a = new int[9];
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
            if(a[i] > max){
                max = a[i];
                c = i+1;
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}

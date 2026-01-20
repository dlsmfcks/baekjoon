import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = a * b * c;
        int g = 0;
        String st = Integer.toString(d);
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] num = new int[10];

        for(int i =0;i<ch.length;i++){
            g = 0;
            for(int j=0;j<st.length();j++){
                if(ch[i] == st.charAt(j)) {
                    g++;
                }
            }
            num[i] = g;
        }
        for(int i : num) {
            System.out.println(i);
        }
    }
}
